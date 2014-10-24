package com.github.datasnap.tests;

import java.util.HashMap;
import java.util.Map;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.IEvent;
import com.github.datasnap.events.GlobalPositionEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class GlobalPositionTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();

		
		String[]organizationIds = {Defaults.ORGANISATION_ID};
		String[]projectIds = {Defaults.PROJECT_ID};
		
		String eventType = "global_position_sighting";
		Place place = new Place();
		place.setPlaceId("placeId");
		place.setLastPlace("placeid-3");
		User user = new User();
		PropId propId = new PropId();
		propId.setMobileDeviceIosIdfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobalDistinctId("userid1234");
		Beacon beacon = new Beacon();
		String beaconid = "SHDG-28AHD";
		beacon.setIdentifier(beaconid);

		GlobalPosition globalPosition = new GlobalPosition();
		// globalPosition.setLocation("coordinates88.21337");
		globalPosition.setAccuracy("10");
		globalPosition.setAltitude("13.00");
		globalPosition.setCourse("77.34375");
		globalPosition.setSpeed("4.0");

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setCreated("2014-08-22 14:48:02 +0000");
		Device device = new Device();
		device.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
		device.setIpAddress("127.1.1.1");
		device.setPlatform("ios");
		device.setOsVersion("7.0");
		device.setModel("iPhone5");
		device.setManufacturer("Apple");
		device.setName("hashed device name");
		device.setVendorId("63A7355F-5AF2-4E20-BE55-C3E80D0305B1");
		device.setCarrierName("Verizon");
		device.setCountryCode("1");
		device.setNetworkCode("327");
		deviceInfo.setDevice(device);
		
		Beacon beacon2 = new Beacon();
		String beaconid2 = "SHDG-test";
		beacon2.setIdentifier(beaconid2);

		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		additionalProperties.put("beacontest", beacon2);
		additionalProperties.put("beacontest2", beacon2);
		
		
		IEvent event = new GlobalPositionEvent(eventType, organizationIds, projectIds, user,
				globalPosition, deviceInfo, additionalProperties);
		dataSnap.addEvent(event);
	}

}
