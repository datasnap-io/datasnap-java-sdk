package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class Geofence {
	

private String id;
   private String name;
   private String visibility;

   private Tags tags;
   private GeofenceCircle geofence_circle; 
    
   public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Tags getPropTags() {
		return tags;
	}

	public void setPropTags(Tags tags) {
		this.tags = tags;
	}

	public GeofenceCircle getGeofence_circle() {
		return geofence_circle;
	}

	public void setGeofence_circle(GeofenceCircle geofence_circle) {
		this.geofence_circle = geofence_circle;
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
}