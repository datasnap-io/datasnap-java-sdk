package com.github.datasnap.tests;
import com.github.datasnap.controller.*;
import com.github.datasnap.propertiesandevents.*;
import com.github.datasnap.utils.Defaults;

public class CommunicationTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
				
			String eventType = "communication_delivered";
			PropPlace propPlace= new PropPlace();
			propPlace.setPlaceId("placeId");
			propPlace.setLast_place("placeid-3");
			PropUser propUser= new PropUser();
			Propid propId = new Propid();
			propId.setMobile_device_bluetooth_identifier("8c4e1f232810d11be96edf47674f5641296a76f5");
			propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
			propId.setGlobal_distinct_id("userid1234");
			propUser.setId(propId);
			PropCommunication propCommunication = new PropCommunication();
			propCommunication.setCommunication_vendor_id("airpush123");
			propCommunication.setName("10% offPushnotification");
			PropType propType = new PropType("typeid", "PushNotification");
			propCommunication.setPropTypes(propType);
			PropContent propContent = new PropContent();
			propContent.setDescription("get10%offifyougotothe");
			propContent.setText("get10%off!");
			propContent.setImage("http: //appl.com/image.gif");
			propContent.setHtml("<p>Hithere!!get10%offnow!!</p>");
			propContent.setUrl("http: //www.apple.com");
			
			PropCampaign propCampaign = new PropCampaign();
			propCampaign.setCampaignid("campaignid");
			propCampaign.setCampaignid("camapign10%offshoes");
            propCampaign.setCommunicationIds("commid1");   // change to array..
			
			Event event = new CommunicationEvent(eventType,Defaults.ORGANISATION_ID, Defaults.PROJECT_ID, propUser, propCommunication, propCampaign );
			dataSnap.addEvent(event);
		}

	}

