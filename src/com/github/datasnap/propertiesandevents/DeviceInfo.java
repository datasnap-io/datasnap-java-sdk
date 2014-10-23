package com.github.datasnap.propertiesandevents;

public class DeviceInfo extends Property{
	
	public String created;
    public Device device;
	
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Device getPropDevice() {
		return device;
	}
	public void setPropDevice(Device device) {
		this.device = device;
	}

}
