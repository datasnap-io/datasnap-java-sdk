package com.github.datasnap.eventthreading;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.datasnap.controller.DataSnapClient;
import com.github.datasnap.controller.RetryingRequester;
import com.github.datasnap.events.IEvent;
import com.github.datasnap.utils.Defaults;

public class DataSnapThread extends Thread {
	
	private LinkedBlockingQueue<IEvent> queue;
	
	// volatile protects the flushing thread from caching the go variable in its
	// own thread context (register)
	// http://stackoverflow.com/questions/2423622/volatile-vs-static-in-java
	// http://stackoverflow.com/questions/4569338/how-is-thread-context-switching-done
	private volatile boolean go;
	/**
	 * An event that helps synchronize when the flusher is idle, so that clients can
	 * block until the flushing thread is done.
	 */
	private ManualResetEvent idle;
	
	private DataSnapClient client;
	private ICreateEventListBatch factory;
	private RetryingRequester requester;
	
	public DataSnapThread(DataSnapClient client, ICreateEventListBatch factory, RetryingRequester requester2) {
		this.client = client;
		this.factory = factory;
		this.requester = requester2;
		this.queue = new LinkedBlockingQueue<IEvent>();
		this.go = true;
		this.idle = new ManualResetEvent(true);
	}
	
	public void run() {
		while (go) {
			List<IEvent> current = new LinkedList<IEvent>();		
			do {
				if (queue.size() == 0) idle.set();			
				IEvent payload = null;
				try {
					// wait half a second for an item to appear,otherwise yield to confirm that we aren't restarting
					payload = queue.poll(500, TimeUnit.MILLISECONDS);
				} catch (InterruptedException e) {
				}
				
				if (payload != null) {
					//  we are no longer idle since there's messages to be processed
					idle.reset();	
					current.add(payload);
					client.getStatistics().updateQueued(this.queue.size());
				}
			} 
			// keep iterating and collecting the current batch, while we're active, there's something in the queue, and we haven't already- over-filled this batch
			while (go && queue.size() > 0 && current.size() < Defaults.BATCH_INCREMENT);		
			if (current.size() > 0) {
				// we have something to send in this batch
				EventListBatchObject eventListBatchObject = factory.create(current);
				client.getStatistics().updateFlushAttempts(1);
				requester.send(eventListBatchObject);
				current = new LinkedList<IEvent>();
			}			
			try {
				// thread context switch to avoid resource contention
				Thread.sleep(0);
			} catch (InterruptedException e) {
			}
		}
	}
	
	public void enqueue(IEvent payload) {
		int maxQueueSize = client.getOptions().getMaxQueueSize();
		int currentQueueSize = queue.size();
		
		if (currentQueueSize <= maxQueueSize) {
			this.queue.add(payload);
			this.client.getStatistics().updateInserted(1);
			this.client.getStatistics().updateQueued(this.queue.size());
		} else {
			// the queue is too high, we can't risk memory overflow
			// add dropped message to statistics, but don't log
			// because the system is likely very resource strapped
			this.client.getStatistics().updateDropped(1);
		}
	}
	
	public void flush() {
		try {
			idle.waitOne(2, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
		}
	}
	
	public void close() {
		go = false;
		
		queue.clear();
	}
}
