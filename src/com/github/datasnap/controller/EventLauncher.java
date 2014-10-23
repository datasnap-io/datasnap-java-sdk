package com.github.datasnap.controller;

import com.github.datasnap.events.Event;

public class EventLauncher {
	
	public void process(Event e){
	for (Object obj: e){
		// do null check on each object
	String className = obj.getClass().getName();
	obj.toString(); // or json string
	
	// do a string builder
	
	// create json string...
	
	}
	}
}
