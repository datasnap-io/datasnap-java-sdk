package com.github.datasnap.propertiesandevents;

import com.github.datasnap.utils.Defaults;

public class Event {
	
	private String organisationid;
	private String projectid;
	
	
	public Event(){};
	
	public Event(String eventType){
		 organisationid = Defaults.ORGANISATION_ID;
		 projectid= Defaults.PROJECT_ID;
	}
	public String getOrganisationid() {
		return organisationid;
	}
	public void setOrganisationid(String organisationid) {
		this.organisationid = organisationid;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}


}
