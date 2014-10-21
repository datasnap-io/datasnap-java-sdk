package com.github.datasnap.tests;
import com.github.datasnap.controller.*;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class GeoFenceTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "geofence_depart";
		PropPlace propPlace= new PropPlace();
		propPlace.setPlaceId("placeId");
		propPlace.setLast_place("placeid-3");
		
		Propid propId = new Propid();
		propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobal_distinct_id("userid1234");
		BeaconProp beaconProp = new BeaconProp();
		String beaconid = "SHDG-28AHD";
		beaconProp.setIdentifier(beaconid);
		
		PropGeofenceCircle propGeofenceCircle = new PropGeofenceCircle();
		propGeofenceCircle.setRadius("100");
		PropLocation location = new PropLocation();
		location.setLatitude("32.89494374592149");
		location.setLongitude("-117.19603832579497");
		
		propGeofenceCircle.setPropLocation(location);
		
		PropGeofence propGeofence = new PropGeofence();
		propGeofence.setId("geofence2");
		propGeofence.setName("SF Gelen Park");
		propGeofence.setGeofence_circle(propGeofenceCircle);
		
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
								
		PropUser propUser= new PropUser();
		// pit in tags and shit 
		
		Event event = new GeoFenceEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, propPlace, propGeofence, propUser);	
				
		dataSnap.addEvent(event);
	}

}
