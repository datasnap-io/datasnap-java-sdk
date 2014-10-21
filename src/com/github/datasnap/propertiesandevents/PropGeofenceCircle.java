package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropGeofenceCircle {
     public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public PropLocation getPropLocation() {
		return propLocation;
	}

	public void setPropLocation(PropLocation propLocation) {
		this.propLocation = propLocation;
	}

	private String radius;
     private PropLocation propLocation;
     
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
