package com.github.datasnap.events;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.github.datasnap.propertiesandevents.Beacon;
import com.github.datasnap.propertiesandevents.DeviceInfo;
import com.github.datasnap.propertiesandevents.Place;
import com.github.datasnap.propertiesandevents.User;
import java.util.Map;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BeaconEvent implements IEvent {

	private String eventType;
	private String[] organizationIds;
	private String[] projectIds;
	private Place place;
	private User user;
	private Beacon beacon;
	private DeviceInfo deviceInfo; // for now

	public BeaconEvent(String eventType, String[] organizationIds,
			String[] projectIds, Place place, User user, Beacon beacon,
			DeviceInfo deviceInfo, Map<String, Object> additionalProperties) {
		this.eventType = eventType;
		this.place = place;
		this.user = user;
		this.beacon = beacon;
		this.deviceInfo = deviceInfo;
		this.additionalProperties = additionalProperties;
		this.organizationIds = organizationIds;
		this.projectIds = projectIds;
	}

	@JsonIgnore
	private Map<String, Object> additionalProperties;

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

	public Beacon getBeacon() {
		return beacon;
	}

	public void setBeacon(Beacon beacon) {
		this.beacon = beacon;
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
