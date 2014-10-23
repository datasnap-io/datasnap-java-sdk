package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class UserProperties {
	
	private String userType;
	private String high;
	private String engagementTime;
		
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getEngagementTime() {
		return engagementTime;
	}

	public void setEngagementTime(String engagementTime) {
		this.engagementTime = engagementTime;
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
