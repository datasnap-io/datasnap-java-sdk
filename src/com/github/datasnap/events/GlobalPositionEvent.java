package com.github.datasnap.events;

import com.github.datasnap.gson.JsonFormatter;
import com.github.datasnap.propertiesandevents.DeviceInfo;
import com.github.datasnap.propertiesandevents.GlobalPosition;
import com.github.datasnap.propertiesandevents.User;

public class GlobalPositionEvent extends Event {

	private String event_type;
	private String organization_ids;
	private String project_ids;
	private User user;
	private GlobalPosition GlobalPosition;
	private DeviceInfo DeviceInfo;

	public GlobalPositionEvent(String event_type, String organization_ids,
			String project_ids, User user, GlobalPosition globalPosition,
			DeviceInfo deviceInfo) {
		super();
		this.event_type = event_type;
		this.organization_ids = organization_ids;
		this.project_ids = project_ids;
		this.user = user;
		GlobalPosition = globalPosition;
		DeviceInfo = deviceInfo;
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

}
