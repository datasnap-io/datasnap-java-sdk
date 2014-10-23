package com.github.datasnap.tests;
import com.github.datasnap.controller.*;
import com.github.datasnap.events.Event;
import com.github.datasnap.events.GlobalPositionEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class GlobalPositionTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "global_position_sighting";
		Place place= new Place();
		place.setPlaceId("placeId");
		place.setLast_place("placeid-3");
		User user= new User();
		Propid propId = new Propid();
		propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobal_distinct_id("userid1234");
		Beacon beacon = new Beacon();
		String beaconid = "SHDG-28AHD";
		beacon.setIdentifier(beaconid);
		
		GlobalPosition globalPosition = new GlobalPosition();
		//globalPosition.setLocation("coordinates88.21337");
		globalPosition.setAccuracy("10");
		globalPosition.setAltitude("13.00");
		globalPosition.setCourse("77.34375");
		globalPosition.setSpeed("4.0");
		
		
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
		deviceInfo.setPropDevice(device);
		
	
		
		Event event = new GlobalPositionEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, user, globalPosition, deviceInfo);
		dataSnap.addEvent(event);
	}

}
