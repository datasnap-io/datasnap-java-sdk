package com.github.datasnap.tests;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.github.datasnap.events.Event;
import com.github.datasnap.gson.JsonFormatter;
import com.github.datasnap.propertiesandevents.Beacon;
import com.github.datasnap.propertiesandevents.DeviceInfo;
import com.github.datasnap.propertiesandevents.Place;
import com.github.datasnap.propertiesandevents.User;
import com.github.datasnap.utils.Defaults;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BeaconEvent extends Event {
		
	private String eventType;
	private String organization_ids;
	private String project_ids;
	private Place place;
	private User user;
	private Beacon beacon;
	private DeviceInfo deviceInfo; 	// for now
	
    // Two mandatory properties
  //  protected final Object id;
   // protected final String name;
	

	  @JsonTypeInfo(include = As.WRAPPER_OBJECT, use = Id.CLASS)
	    private Object data;
	
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	// and then "other" stuff:
	     Map<String,Object> other = new HashMap<String,Object>();

	    // Could alternatively add setters, but since these are mandatory
	 //   @JsonCreator
	  //  public BeaconEvent(@JsonProperty("id") Object id, @JsonProperty("name") String name)
	 //   {
	  //      this.id = id;
	//        this.name = name;
	//    }

//	    public Object getId() { 
//	    	return id; 
//	    	}
//	    
//	    public String getName() { 
//	    	return name; 
//	    	}

	    public Object get(String name) {
	        return other.get(name);
	    }
	    // "any getter" needed for serialization    
	    @JsonAnyGetter
	    public Map<String,Object> any() {
	        return other;
	    }

	    @JsonAnySetter
	    public void set(String name, Object value) {
	        other.put(name, value);
	    }
	
	
		private Map<String, Object> additionalProperties;
		
	    public Map<String, Object> getAdditionalProperties() {
	        return this.additionalProperties;
	    }

	    public void setAdditionalProperty(String name, Object value) {
	        this.additionalProperties.put(name, value);
	    }
	    
	    
	    
	    
	
	    public BeaconEvent(String eventType, Place place,
			User user, Beacon beacon, DeviceInfo deviceInfo, 
			 Map<String,Object> other){
		super(eventType);
		this.eventType = eventType;
		this.place = place;
		this.user = user;
		this.beacon = beacon;
		this.deviceInfo = deviceInfo;
        this.other = other;
		// will need some nullchecks here
		// if (object == null) object = new Object();
	}

	public String getEvent_type() {
		return eventType;
	}

	public void setEvent_type(String event_type) {
		this.eventType = event_type;
	}

	public String getOrganization_ids() {
		return organization_ids;
	}

	public void setOrganization_ids() {
		this.organization_ids = super.getOrganisationid();
	}

	public String getProject_ids() {
		return project_ids;
	}

	public void setProject_ids() {
		this.project_ids = super.getProjectid();
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
