package com.github.datasnap.tests;
import com.github.datasnap.controller.*;
import com.github.datasnap.events.Event;
import com.github.datasnap.events.InteractionEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class InteractionTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "opt_in_vendor";
		Place place= new Place();
		place.setPlaceId("placeId");
		place.setLast_place("placeid-3");
		User user= new User();
		Propid propId = new Propid();
		propId.setMobile_device_bluetooth_identifier("8c4e1f232810d11be96edf47674f5641296a76f5");
		propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobal_distinct_id("userid1234");
		user.setOptInLocation(true);
		user.setOptInPushNotifications(true);
		user.setOptInVendor(true);
		user.setId(propId);
								
		Event event = new InteractionEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, user);
		dataSnap.addEvent(event);
	}

}
