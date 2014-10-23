package com.github.datasnap.eventthreading;

import java.util.List;

import com.github.datasnap.events.IEvent;

/**
 * A Factory that creates EventListBatchObject objects
 *
 */
public interface ICreateEventListBatch {

	/**
	 * Creates a batch model around a list of items
	 * @param batch A list of items that represents the batch
	 * @return {@link EventListBatchObject}
	 */
	public EventListBatchObject create(List<IEvent> batch);
	
}
