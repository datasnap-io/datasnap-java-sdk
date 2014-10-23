package com.github.datasnap.events;

import com.github.datasnap.propertiesandevents.Beacon;
import com.github.datasnap.propertiesandevents.Place;
import com.github.datasnap.propertiesandevents.User;

public class UpdateEvent extends Event {

	// different types of updates- might link to other event types....

	private String event_type;
	private String organization_ids;
	private String project_ids;
	private Beacon Beacon;
	private Place place;
	private User user;

	public UpdateEvent(String event_type, String organization_ids,
			String project_ids,
			com.github.datasnap.propertiesandevents.Beacon beacon) {
		super();
		this.event_type = event_type;
		this.organization_ids = organization_ids;
		this.project_ids = project_ids;
		Beacon = beacon;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public String getOrganization_ids() {
		return organization_ids;
	}

	public void setOrganization_ids(String organization_ids) {
		this.organization_ids = organization_ids;
	}

	public String getProject_ids() {
		return project_ids;
	}

	public void setProject_ids(String project_ids) {
		this.project_ids = project_ids;
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

}
