package com.github.datasnap.events;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.datasnap.controller.AdditionalProperties;
import com.github.datasnap.utils.Defaults;
import com.google.gson.JsonObject;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Event implements Iterable {
	
	private String organisationid;
	private String projectid;
	// private AdditionalProperties additionalProperties;
	private JsonObject obj;
	
	public Event(){};
	
	public Event(String eventType){
		 organisationid = Defaults.ORGANISATION_ID;
		 projectid= Defaults.PROJECT_ID;
	//	 additionalProperties = new AdditionalProperties();
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

 /*    public AdditionalProperties getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    } */

	public JsonObject getObj() {
		return obj;
	}

	public void setObj(JsonObject obj) {
		this.obj = obj;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}


}
