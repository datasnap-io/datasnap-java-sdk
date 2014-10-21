package com.github.datasnap.tests;
import com.github.datasnap.controller.*;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class InteractionTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "opt_in_vendor";
		PropPlace propPlace= new PropPlace();
		propPlace.setPlaceId("placeId");
		propPlace.setLast_place("placeid-3");
		PropUser propUser= new PropUser();
		Propid propId = new Propid();
		propId.setMobile_device_bluetooth_identifier("8c4e1f232810d11be96edf47674f5641296a76f5");
		propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobal_distinct_id("userid1234");
		propUser.setOpt_in_location("true");
		propUser.setOptInPushNotifications("true");
		propUser.setOptInVendor("true");
		propUser.setId(propId);
								
		Event event = new InteractionEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, propUser);
		dataSnap.addEvent(event);
	}

}
