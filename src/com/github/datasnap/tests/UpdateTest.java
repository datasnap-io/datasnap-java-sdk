package com.github.datasnap.tests;

import java.util.ArrayList;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.Event;
import com.github.datasnap.events.UpdateEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class UpdateTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "beacon_update";
		Beacon propBeacon = new Beacon();
		
		propBeacon.setIdentifier("SHDG-28AHD");
		propBeacon.setBle_uuid("ble_uuid"); 
		propBeacon.setBle_vendor_uuid("ble_vendor_uuid");
		propBeacon.setBle_vendor_id("ble_vendor_id");
		propBeacon.setName("Front Entrance");
		propBeacon.setIs_mobile("false");
		propBeacon.setStart_time("2014-08-22 14:48:02 +0000");
		propBeacon.setLast_update_time("2014-08-22 14:48:02 +0000");
		propBeacon.setLatitude("11.22222");
		propBeacon.setLongitude("123.444");
		propBeacon.setVisibility("Private");
		propBeacon.setBattery_level("50");
		propBeacon.setTemperature("68.32");
		propBeacon.setHardware("HardwaretypeoftheBeacon");
		Categories categories = new Categories();
		
		ArrayList<String> sports = new ArrayList<String>();
	    ArrayList<String> womens = new ArrayList<String>(); // dealing with subcategories...
	    ArrayList<String> mens = new ArrayList<String>();
		
	    womens.add("golfshirts");
	    womens.add("dresses");

		
		categories.setMens(mens);
		categories.setWomens(womens);
		categories.setSports(sports);
          
		ArrayList<String> tagz = new ArrayList();
		tagz.add("women");
		tagz.add("golf");
		tagz.add("shoes");
		Tags tags = new Tags(); // override this constructor
		tags.setTags(tagz);
		
		propBeacon.setPropTags(tags);

		
		
		Event event = new UpdateEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID,propBeacon );
		dataSnap.addEvent(event);
	}

}

