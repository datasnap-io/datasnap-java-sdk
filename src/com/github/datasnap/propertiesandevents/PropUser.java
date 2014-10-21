package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropUser {

	private PropTags propTags;
    private Propid Propid;
    private PropAudience propAudience;
    private PropUserProperties propUserProperties; 
	private String opt_in_location;     // put in boolean handling code
    private String optInPushNotifications;     // put in boolean handling code
    private String optInVendor;     // put in boolean handling code
	
	public PropTags getTags() {
		return propTags;
	}

	public void setTags(PropTags propTags) {
		this.propTags = propTags;
	}

	public Propid getId() {
		return Propid;
	}

	public void setId(Propid Propid) {
		this.Propid = Propid;
	}

	public PropAudience getAudience() {
		return propAudience;
	}

	public void setAudience(PropAudience propAudience) {
		this.propAudience = propAudience;
	}

	public PropUserProperties getUserProperties() {
		return propUserProperties;
	}

	public void setUserProperties(PropUserProperties propUserProperties) {
		this.propUserProperties = propUserProperties;
	}
    
    public String getOpt_in_location() {
		return opt_in_location;
	}

	public void setOpt_in_location(String opt_in_location) {
		this.opt_in_location = opt_in_location;
	}

	public String getOptInPushNotifications() {
		return optInPushNotifications;
	}

	public void setOptInPushNotifications(String optInPushNotifications) {
		this.optInPushNotifications = optInPushNotifications;
	}

	public String getOptInVendor() {
		return optInVendor;
	}

	public void setOptInVendor(String optInVendor) {
		this.optInVendor = optInVendor;
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
	
	
