package com.github.datasnap.controller;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.joda.time.DateTime;

import com.github.datasnap.events.Event;
// import com.github.segmentio.gson.DateTimeTypeConverter;
import com.google.gson.GsonBuilder;
// import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonWriter;
	


	public class AdditionalPropertiesJsonAdapter implements JsonSerializer<AdditionalProperties> {

		 @Override
		 public JsonObject serialize(AdditionalProperties additionalProperties, Type typeOfSrc,
		            JsonSerializationContext context)
		    {

		     JsonObject obj = new JsonObject();

			 Map<String, Object> selects = additionalProperties.getAdditionalProperties();

			 for(Entry<String, Object> entry : selects.entrySet()) {
			     String key = entry.getKey();
			     Object value = entry.getValue();			     
			        obj.addProperty(key, value.toString());
			 }
			     
			  return obj; 
			     // do what you have to do here
			     // In your case, an other loop.
			 } 
	}
			 
	
	
			 
		//	   public static final GsonBuilder BUILDER = new GsonBuilder()
        //       .registerTypeAdapter(DateTime.class, new DateTimeTypeConverter())
			 
			//   GsonBuilder gson = new GsonBuilder();
			//    List<Number> numbers = new ArrayList<>();
		//	    numbers.add(new Integer(42));
		//	    numbers.add(new Integer(-30));
		//	    numbers.add(new BigDecimal("654.2"));


			 
			// String json = gson.toJson(event);
			
			
		      
		  //  }

		

	

	


