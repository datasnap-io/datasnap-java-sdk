package com.github.datasnap.events;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.github.datasnap.propertiesandevents.Geofence;
import com.github.datasnap.propertiesandevents.Place;
import com.github.datasnap.propertiesandevents.User;

public class GeoFenceEvent implements IEvent {

	private String eventType;
	private String[] organizationIds;
	private String[] projectIds;
	private Place place;
	private Geofence geofence;
	private User user;
	@JsonIgnore
	private Map<String, Object> additionalProperties;

	public GeoFenceEvent(String eventType, String[] organizationIds,
			String[] projectIds, Place place, Geofence geofence, User user, Map<String, Object> additionalProperties) {
		super();
		this.eventType = eventType;
		this.organizationIds = organizationIds;
		this.projectIds = projectIds;
		this.place = place;
		this.geofence = geofence;
		this.user = user;
		this.additionalProperties = additionalProperties;

	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	public String getEvent_type() {
		return eventType;
	}

	public void setEvent_type(String eventType) {
		this.eventType = eventType;
	}

	public String[] getOrganizationIds() {
		return organizationIds;
	}

	public void setOrganizationIds(String[] organizationIds) {
		this.organizationIds = organizationIds;
	}

	public String[] getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(String[] projectIds) {
		this.projectIds = projectIds;
	}

	public Geofence getGeofence() {
		return geofence;
	}

	public void setGeofence(Geofence geofence) {
		this.geofence = geofence;
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

}
