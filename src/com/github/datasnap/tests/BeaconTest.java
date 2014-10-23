package com.github.datasnap.tests;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.EvAd;
import com.github.datasnap.events.Event;
import com.github.datasnap.propertiesandevents.*;

public class BeaconTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "beacon_depart";
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
		
		Beacon beacon2 = new Beacon();
		String beaconid2 = "SHDG-test";
		beacon2.setIdentifier(beaconid2);
				
		
		
	    Map<String, Object> additionalProperties = new HashMap<String, Object> ();
	    
    additionalProperties.put("becaontest", beacon2);
    additionalProperties.put("becaontest2", beacon2);   
		
		
		
		
		// Event event = new BeaconEvent(eventType,place,user,beacon,deviceInfo,123, "testname");	
       
		BeaconEvent event = new BeaconEvent(eventType,place,user,beacon,deviceInfo, additionalProperties);	
       event.set("testname", beacon2);
		
		event.any();
		
		
		
	       ObjectMapper mapper = new ObjectMapper();
		      // mapper.setSerializationInclusion(Include.NON_NULL);
				  mapper.setSerializationInclusion(Inclusion.NON_NULL);
				//  mapper.setAnnotationIntrospector(ai)
		       String json = mapper.writeValueAsString(event);
					System.out.println(json);
		
		
	//	AdditionalProperties additionalProperties = new AdditionalProperties();
	//	additionalProperties.setAdditionalProperty("test", new String("testte"));
		//event.set
		
	//	event.setObj(EvAd.processAdditional(additionalProperties));
		
	//	dataSnap.addEvent(event);
	}

}
