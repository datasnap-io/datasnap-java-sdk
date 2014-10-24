package com.github.datasnap.tests;

import java.util.HashMap;
import java.util.Map;

import com.github.datasnap.controller.*;
import com.github.datasnap.events.CommunicationEvent;
import com.github.datasnap.events.IEvent;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class CommunicationTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();

		
		String[]organizationIds = {Defaults.ORGANISATION_ID};
		String[]projectIds = {Defaults.PROJECT_ID};
		String eventType = "communication_delivered";
		Place place = new Place();
		place.setPlaceId("placeId");
		place.setLastPlace("placeid-3");
		User user = new User();
		PropId propId = new PropId();
		propId.setMobileDeviceBluetoothIdentifier("8c4e1f232810d11be96edf47674f5641296a76f5");
		propId.setMobileDeviceIosIdfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobalDistinctId("userid1234");
		user.setId(propId);
		Communication communication = new Communication();
		communication.setCommunicationVendorId("airpush123");
		communication.setName("10% offPushnotification");
		Type type = new Type();
		type.setId("typeid");
		type.setName("PushNotification");
		communication.setPropTypes(type);
		Content content = new Content();
		content.setDescription("get10%offifyougotothe");
		content.setText("get10%off!");
		content.setImage("http: //appl.com/image.gif");
		content.setHtml("<p>Hithere!!get10%offnow!!</p>");
		content.setUrl("http: //www.apple.com");

		Campaign campaign = new Campaign();
		campaign.setCampaignId("campaignid");
		campaign.setCampaignId("camapign10%offshoes");
		campaign.setCommunicationIds("commid1"); // change to array..

		Beacon beacon2 = new Beacon();
		String beaconid2 = "SHDG-test";
		beacon2.setIdentifier(beaconid2);

		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		additionalProperties.put("beacontest", beacon2);
		additionalProperties.put("beacontest2", beacon2);
		
		
		IEvent event = new CommunicationEvent(eventType, organizationIds, projectIds, user,
				communication, campaign, additionalProperties);
		dataSnap.addEvent(event);
	}

}
