package com.github.datasnap.tests;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.IEvent;
import com.github.datasnap.events.InteractionEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class InteractionTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();

		String eventType = "opt_in_vendor";
		Place place = new Place();
		place.setPlaceId("placeId");
		place.setLastPlace("placeid-3");
		User user = new User();
		PropId propId = new PropId();
		propId.setMobileDeviceBluetoothIdentifier("8c4e1f232810d11be96edf47674f5641296a76f5");
		propId.setMobileDeviceIosIdfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobalDistinctId("userid1234");
		user.setOptInLocation(true);
		user.setOptInPushNotifications(true);
		user.setOptInVendor(true);
		user.setId(propId);

		IEvent event = new InteractionEvent(eventType,
				Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, user);
		dataSnap.addEvent(event);
	}

}
