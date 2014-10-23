package com.github.datasnap.events;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.github.datasnap.propertiesandevents.User;

public class InteractionEvent implements IEvent{

	private String eventType;
	private String organizationIds;
	private String projectIds;
	private User user;
	@JsonIgnore
	private Map<String, Object> additionalProperties;

	// opt-in stuff needed	
	public InteractionEvent(String eventType, String organizationIds,
			String projectIds, User user) {
		super();
		this.eventType = eventType;
		this.organizationIds = organizationIds;
		this.projectIds = projectIds;
		this.user = user;
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
