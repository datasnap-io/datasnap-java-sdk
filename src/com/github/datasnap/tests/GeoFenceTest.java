package com.github.datasnap.tests;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.IEvent;
import com.github.datasnap.events.GeoFenceEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class GeoFenceTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();

		String[]organizationIds = {Defaults.ORGANISATION_ID};
		String[]projectIds = {Defaults.PROJECT_ID};
		
		String eventType = "geofence_depart";
		Place place = new Place();
		place.setPlaceId("placeId");
		place.setLastPlace("placeid-3");

		Beacon beacon = new Beacon();
		String beaconid = "SHDG-28AHD";
		beacon.setIdentifier(beaconid);

		GeofenceCircle geofenceCircle = new GeofenceCircle();
		geofenceCircle.setRadius("100");
		BigDecimal[] coordinates = new BigDecimal[] {
				new BigDecimal(32.89494374592149).setScale(15,
						RoundingMode.HALF_EVEN),
				new BigDecimal(-117.19603832579497).setScale(15,
						RoundingMode.HALF_EVEN) };
		Location location = new Location(coordinates);
		geofenceCircle.setPropLocation(location);

		Geofence geofence = new Geofence();
		geofence.setId("geofence2");
		geofence.setName("SF Gelen Park");
		geofence.setGeofenceCircle(geofenceCircle);

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

		User user = new User();
		PropId propId = new PropId();
		propId.setMobileDeviceIosIdfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobalDistinctId("userid1234");

		ArrayList<String> tagz = new ArrayList();
		tagz.add("women");
		tagz.add("golf");
		tagz.add("shoes");
		Tags tags = new Tags(); // override this constructor
		tags.setTags(tagz);
		user.setTags(tags);
		
		Beacon beacon2 = new Beacon();
		String beaconid2 = "SHDG-test";
		beacon2.setIdentifier(beaconid2);

		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		additionalProperties.put("beacontest", beacon2);
		additionalProperties.put("beacontest2", beacon2);
		
		
		IEvent event = new GeoFenceEvent(eventType, organizationIds, projectIds, place, geofence, user, additionalProperties);

		dataSnap.addEvent(event);
	}

}
