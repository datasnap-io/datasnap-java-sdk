package com.github.datasnap.events;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.github.datasnap.propertiesandevents.Beacon;
import com.github.datasnap.propertiesandevents.Place;
import com.github.datasnap.propertiesandevents.User;

public class UpdateEvent implements IEvent{

	// different types of updates- might link to other event types....

	private String eventType;
	private String organizationIds;
	private String projectIds;
	private Beacon Beacon;
	private Place place;
	private User user;
	@JsonIgnore
	private Map<String, Object> additionalProperties;

	public UpdateEvent(String eventType, String organizationIds,
			String projectIds,
			com.github.datasnap.propertiesandevents.Beacon beacon) {
		super();
		this.eventType = eventType;
		this.organizationIds = organizationIds;
		this.projectIds = projectIds;
		Beacon = beacon;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getOrganizationIds() {
		return organizationIds;
	}

	public void setOrganizationIds(String organizationIds) {
		this.organizationIds = organizationIds;
	}

	public String getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(String projectIds) {
		this.projectIds = projectIds;
	}

	public Beacon getBeacon() {
		return Beacon;
	}

	public void setBeacon(Beacon Beacon) {
		this.Beacon = Beacon;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties ;
	}

}
