package com.github.datasnap.controller;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DynaBean
{
    // Two mandatory properties
    protected final int id;
    protected final String name;

    // and then "other" stuff:
    protected Map<String,Object> other = new HashMap<String,Object>();

    // Could alternatively add setters, but since these are mandatory
    @JsonCreator
    public DynaBean(@JsonProperty("id") int id, @JsonProperty("name") String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId() { 
    	return id; 
    	}
    
    public String getName() { 
    	return name; 
    	}

    public Object get(String name) {
        return other.get(name);
    }
    // "any getter" needed for serialization    
    @JsonAnyGetter
    public Map<String,Object> any() {
        return other;
    }

    @JsonAnySetter
    public void set(String name, Object value) {
        other.put(name, value);
    }
}