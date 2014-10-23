package com.github.datasnap.controller;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Testq {
	  private int value1 = 1;
	  private String value2 = "abc";
	  private transient int value3 = 3;
	  public Testq() {
	    // no-args constructor
	  }
	  
	  public static void main(String args[]){
		  Testq t = new Testq();
		  Gson gson = new Gson();
		  String json = gson.toJson(t); 
		  System.out.println(json);
		//  ==> json is {"value1":1,"value2":"abc"}
		  
		  
		  Gson gson1 = new GsonBuilder()
	        .setPrettyPrinting().create();
	Map<Point, String> original = new HashMap<Point, String>();
	original.put(new Point(1, 2), "a");
	original.put(new Point(3, 4), "b");
	System.out.println(gson1.toJson(original));
		  
	  }
	  
	}
