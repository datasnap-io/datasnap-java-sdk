package com.github.datasnap.controller;

import java.util.HashMap;
import java.util.Map;

public class AdditionalProperties {
    
	private Map<String, Object> additionalProperties;
	public AdditionalProperties(){
	}
	
	public void createNewInstance(){		
		additionalProperties = new HashMap<String, Object>();

	}
		
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AdditionalProperties put(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
