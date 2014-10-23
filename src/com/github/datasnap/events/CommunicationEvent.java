package com.github.datasnap.events;

import com.github.datasnap.propertiesandevents.Campaign;
import com.github.datasnap.propertiesandevents.Communication;
import com.github.datasnap.propertiesandevents.User;

public class CommunicationEvent extends Event {

	private String event_type;
	private String organization_ids;
	private String project_ids;
	private User user;
	private Communication communication;
	private Campaign campaign;

	public CommunicationEvent(String event_type, String organization_ids,
			String project_ids, User user,
			Communication communication, Campaign campaign) {
		super();
		this.event_type = event_type;
		this.organization_ids = organization_ids;
		this.project_ids = project_ids;
		this.user = user;
		this.communication = communication;
		this.campaign = campaign;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Communication getCommunication() {
		return communication;
	}

	public void setCommunication(Communication communication) {
		this.communication = communication;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
