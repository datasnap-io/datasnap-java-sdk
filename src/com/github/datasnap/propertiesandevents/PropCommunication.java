package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropCommunication extends Property{
	
	private String description;
    private PropTags propTags;
    private String id;
    private String status;
    private String communication_vendor_id;
    private String name;
    private PropType propTypes;
    private PropContent propContent;
	
	
    public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public PropTags getPropTags() {
		return propTags;
	}
	public void setPropTags(PropTags propTags) {
		this.propTags = propTags;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCommunication_vendor_id() {
		return communication_vendor_id;
	}
	public void setCommunication_vendor_id(String communication_vendor_id) {
		this.communication_vendor_id = communication_vendor_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PropType getPropTypes() {
		return propTypes;
	}
	public void setPropTypes(PropType propTypes) {
		this.propTypes = propTypes;
	}
	public PropContent getPropContent() {
		return propContent;
	}
	public void setPropContent(PropContent propContent) {
		this.propContent = propContent;
	}

    
    
	
    
    
}



