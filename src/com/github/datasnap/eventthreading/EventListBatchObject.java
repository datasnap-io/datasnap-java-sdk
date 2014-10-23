package com.github.datasnap.eventthreading;

import java.util.List;
import java.util.UUID;

import org.joda.time.DateTime;

import com.github.datasnap.events.IEvent;

public class EventListBatchObject {

	private List<IEvent> batch;
	// private String messageId;
	private DateTime sentAt;
	
	public EventListBatchObject(List<IEvent> batch) {
		this.batch = batch;
	//	this.messageId = UUID.randomUUID().toString();
	}
	
	public List<IEvent> getBatch() {
		return batch;
	}
	
	public void setBatch(List<IEvent> batch) {
		this.batch = batch;
	}
	
	/* public String getMessageId() {
		return messageId;
	}
	
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	*/
	public DateTime getSentAt() {
		return sentAt;
	}
	
	public void setSentAt(DateTime sentAt) {
		this.sentAt = sentAt;
	}
	
}
