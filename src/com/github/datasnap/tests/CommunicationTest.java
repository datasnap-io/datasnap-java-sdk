package com.github.datasnap.tests;
import com.github.datasnap.controller.*;
import com.github.datasnap.events.CommunicationEvent;
import com.github.datasnap.events.Event;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class CommunicationTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
				
			String eventType = "communication_delivered";
			Place place= new Place();
			place.setPlaceId("placeId");
			place.setLast_place("placeid-3");
			User user= new User();
			Propid propId = new Propid();
			propId.setMobile_device_bluetooth_identifier("8c4e1f232810d11be96edf47674f5641296a76f5");
			propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
			propId.setGlobal_distinct_id("userid1234");
			user.setId(propId);
			Communication communication = new Communication();
			communication.setCommunication_vendor_id("airpush123");
			communication.setName("10% offPushnotification");
			Type type = new Type("typeid", "PushNotification");
			communication.setPropTypes(type);
			Content content = new Content();
			content.setDescription("get10%offifyougotothe");
			content.setText("get10%off!");
			content.setImage("http: //appl.com/image.gif");
			content.setHtml("<p>Hithere!!get10%offnow!!</p>");
			content.setUrl("http: //www.apple.com");
			
			Campaign campaign = new Campaign();
			campaign.setCampaignid("campaignid");
			campaign.setCampaignid("camapign10%offshoes");
            campaign.setCommunicationIds("commid1");   // change to array..
			
			Event event = new CommunicationEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, user, communication, campaign );
			dataSnap.addEvent(event);
		}

	}

