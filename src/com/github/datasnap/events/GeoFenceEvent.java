package com.github.datasnap.events;

import com.github.datasnap.gson.JsonFormatter;
import com.github.datasnap.propertiesandevents.Geofence;
import com.github.datasnap.propertiesandevents.Place;
import com.github.datasnap.propertiesandevents.User;

public class GeoFenceEvent extends Event{
	
	public GeoFenceEvent(String event_type, String organization_ids,
			String project_ids, Place place, Geofence geofence,
			User user) {
		super();
		this.event_type = event_type;
		this.organization_ids = organization_ids;
		this.project_ids = project_ids;
		this.place = place;
		this.geofence = geofence;
		this.user = user;
	}
			
	private String event_type;
	private String  organization_ids;
	private String  project_ids;
	private Place place;
	private Geofence geofence;
	private User user;
	
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
 
	 
		/**
		 * Returns a JSON string corresponding to object state
		 *
		 * @return JSON representation
		 */
	 	 
		public String toJSON() {
			return JsonFormatter.toJSON(this);
		}

		@Override
		public String toString() {
			return toJSON();
		}

		public Geofence getGeofence() {
			return geofence;
		}

		public void setGeofence(Geofence geofence) {
			this.geofence = geofence;
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
