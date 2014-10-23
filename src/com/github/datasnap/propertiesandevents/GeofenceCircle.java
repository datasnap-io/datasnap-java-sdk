package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class GeofenceCircle {
     public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public Location getPropLocation() {
		return location;
	}

	public void setPropLocation(Location location) {
		this.location = location;
	}

	private String radius;
     private Location location;
     
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
