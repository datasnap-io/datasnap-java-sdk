package com.github.datasnap.events;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.github.datasnap.propertiesandevents.DeviceInfo;
import com.github.datasnap.propertiesandevents.GlobalPosition;
import com.github.datasnap.propertiesandevents.User;

public class GlobalPositionEvent implements IEvent{

	private String eventType;
	private String organizationIds;
	private String projectIds;
	private User user;
	private GlobalPosition GlobalPosition;
	private DeviceInfo DeviceInfo;
	@JsonIgnore
	private Map<String, Object> additionalProperties;

	public GlobalPositionEvent(String eventType, String organizationIds,
			String projectIds, User user, GlobalPosition globalPosition,
			DeviceInfo deviceInfo) {
		super();
		this.eventType = eventType;
		this.organizationIds = organizationIds;
		this.projectIds = projectIds;
		this.user = user;
		GlobalPosition = globalPosition;
		DeviceInfo = deviceInfo;
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

	public GlobalPosition getGlobalPosition() {
		return GlobalPosition;
	}

	public void setGlobalPosition(GlobalPosition GlobalPosition) {
		this.GlobalPosition = GlobalPosition;
	}

	public DeviceInfo getDeviceInfo() {
		return DeviceInfo;
	}

	public void setDeviceInfo(DeviceInfo DeviceInfo) {
		this.DeviceInfo = DeviceInfo;
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
