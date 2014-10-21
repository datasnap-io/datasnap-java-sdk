package com.github.datasnap.tests;
import com.github.datasnap.controller.*;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class GlobalPositionTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "global_position_sighting";
		PropPlace propPlace= new PropPlace();
		propPlace.setPlaceId("placeId");
		propPlace.setLast_place("placeid-3");
		PropUser propUser= new PropUser();
		Propid propId = new Propid();
		propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobal_distinct_id("userid1234");
		BeaconProp beaconProp = new BeaconProp();
		String beaconid = "SHDG-28AHD";
		beaconProp.setIdentifier(beaconid);
		
		PropGlobalPosition propGlobalPosition = new PropGlobalPosition();
		propGlobalPosition.setLocation("coordinates88.21337");
		propGlobalPosition.setAccuracy("10");
		propGlobalPosition.setAltitude("13.00");
		propGlobalPosition.setCourse("77.34375");
		propGlobalPosition.setSpeed("4.0");
		
		
		PropDeviceInfo propDeviceInfo = new PropDeviceInfo();
        propDeviceInfo.setCreated("2014-08-22 14:48:02 +0000");        
		PropDevice propDevice = new PropDevice();
		propDevice.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
		propDevice.setIp_address("127.1.1.1");  
		propDevice.setPlatform("ios");  
		propDevice.setOs_version("7.0");   
		propDevice.setModel("iPhone5");  
		propDevice.setManufacturer("Apple");  
		propDevice.setName("hashed device name");  
		propDevice.setVendor_id("63A7355F-5AF2-4E20-BE55-C3E80D0305B1");  
		propDevice.setCarrier_name("Verizon");   
		propDevice.setCountry_code("1");   
		propDevice.setNetwork_code("327");   
		propDeviceInfo.setPropDevice(propDevice);
		
	
		
		Event event = new GlobalPositionEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, propUser, propGlobalPosition, propDeviceInfo);
		dataSnap.addEvent(event);
	}

}
