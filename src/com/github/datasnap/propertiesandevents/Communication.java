package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class Communication extends Property{
	
	private String description;
    private Tags tags;
    private String id;
    private String status;
    private String communication_vendor_id;
    private String name;
    private Type types;
    private Content content;
	
	
    public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Tags getPropTags() {
		return tags;
	}
	public void setPropTags(Tags tags) {
		this.tags = tags;
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
	public Type getPropTypes() {
		return types;
	}
	public void setPropTypes(Type types) {
		this.types = types;
	}
	public Content getPropContent() {
		return content;
	}
	public void setPropContent(Content content) {
		this.content = content;
	}

    
    
	
    
    
}



