package com.github.datasnap.tests;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.Event;
import com.github.datasnap.events.GeoFenceEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class GeoFenceTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "geofence_depart";
		Place place= new Place();
		place.setPlaceId("placeId");
		place.setLast_place("placeid-3");
		
		Beacon beacon = new Beacon();
		String beaconid = "SHDG-28AHD";
		beacon.setIdentifier(beaconid);
		
		GeofenceCircle geofenceCircle = new GeofenceCircle();
		geofenceCircle.setRadius("100");
		BigDecimal [] coordinates = new BigDecimal[] {new BigDecimal (32.89494374592149).setScale(15, RoundingMode.HALF_EVEN), new BigDecimal (-117.19603832579497).setScale(15, RoundingMode.HALF_EVEN)} ;
		Location location = new Location(coordinates);
		geofenceCircle.setPropLocation(location);
		
		Geofence geofence = new Geofence();
		geofence.setId("geofence2");
		geofence.setName("SF Gelen Park");
		geofence.setGeofence_circle(geofenceCircle);
		
		DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setCreated("2014-08-22 14:48:02 +0000");        
		Device device = new Device();
		device.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
		device.setIp_address("127.1.1.1");  
		device.setPlatform("ios");  
		device.setOs_version("7.0");   
		device.setModel("iPhone5");  
		device.setManufacturer("Apple");  
		device.setName("hashed device name");  
		device.setVendor_id("63A7355F-5AF2-4E20-BE55-C3E80D0305B1");  
		device.setCarrier_name("Verizon");   
		device.setCountry_code("1");   
		device.setNetwork_code("327");   
								
		User user= new User();
		Propid propId = new Propid();
		propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobal_distinct_id("userid1234");	
		
		
		ArrayList<String> tagz = new ArrayList();
		tagz.add("women");
		tagz.add("golf");
		tagz.add("shoes");
		Tags tags = new Tags(); // override this constructor
		tags.setTags(tagz);
		user.setTags(tags);
		Event event = new GeoFenceEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, place, geofence, user);	
				
		dataSnap.addEvent(event);
	}

}
