package com.github.datasnap.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.IEvent;
import com.github.datasnap.events.UpdateEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class UpdateTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String[]organizationIds = {Defaults.ORGANISATION_ID};
		String[]projectIds = {Defaults.PROJECT_ID};
		
		String eventType = "beacon_update";
		Beacon propBeacon = new Beacon();
		
		propBeacon.setIdentifier("SHDG-28AHD");
		propBeacon.setBleUuid("ble_uuid"); 
		propBeacon.setBleVendorUuid("ble_vendor_uuid");
		propBeacon.setBleVendorId("ble_vendor_id");
		propBeacon.setRssi("-40");
		propBeacon.setName("Front Entrance");
		propBeacon.setIsMobile("false");
		propBeacon.setStartTime("2014-08-22 14:48:02 +0000");
		propBeacon.setLastUpdateTime("2014-08-22 14:48:02 +0000");
		propBeacon.setLatitude("11.22222");
		propBeacon.setLongitude("123.444");
		propBeacon.setVisibility("Private");
		propBeacon.setBatteryLevel("50");
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

		Beacon beacon2 = new Beacon();
		String beaconid2 = "SHDG-test";
		beacon2.setIdentifier(beaconid2);

		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		additionalProperties.put("beacontest", beacon2);
		additionalProperties.put("beacontest2", beacon2);
		
		
		IEvent event = new UpdateEvent(eventType, organizationIds, projectIds ,propBeacon, additionalProperties );
		dataSnap.addEvent(event);
	}

}

