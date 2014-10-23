package com.github.datasnap.events;

import com.github.datasnap.gson.JsonFormatter;
import com.github.datasnap.propertiesandevents.User;

public class InteractionEvent extends Event {

	public InteractionEvent(String event_type, String organization_ids,
			String project_ids, User user) {
		super();
		this.event_type = event_type;
		this.organization_ids = organization_ids;
		this.project_ids = project_ids;
		this.user = user;
	}

	private String event_type;
	private String organization_ids;
	private String project_ids;
	private User user;

	// opt-in stuff needed

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
