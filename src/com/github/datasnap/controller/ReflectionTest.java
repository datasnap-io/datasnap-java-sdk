package com.github.datasnap.controller;

import java.lang.reflect.Method;

import com.github.datasnap.events.Event;

public class ReflectionTest {
	
	public void process(){

		for (Method method : Event.class.getMethods()) {
		  if (method.getName().equals("process")) {
		   
		  }
		}
	}
	

}
