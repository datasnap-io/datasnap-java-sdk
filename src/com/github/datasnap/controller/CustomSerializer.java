package com.github.datasnap.controller;

import java.lang.reflect.Type;

import org.joda.time.DateTime;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class CustomSerializer implements JsonSerializer<DateTime> {
	  public JsonElement serialize(DateTime src, Type typeOfSrc, JsonSerializationContext context) {
		    return new JsonPrimitive(src.toString());
		  }}

//GsonBuilder gson = new GsonBuilder();
//gson.registerTypeAdapter(MyType2.class, new MyTypeAdapter());
//gson.registerTypeAdapter(MyType.class, new MySerializer());
//gson.registerTypeAdapter(MyType.class, new MyDeserializer());
//gson.registerTypeAdapter(MyType.class, new MyInstanceCreator());

//registerTypeAdapter call checks if the type adapter implements more than one of these interfaces and register it for all of them.
//Writing a Serializer

//Here is an example of how to write a custom serializer for JodaTime DateTime class. 

