package resources;

import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;
import Pojo.Location;

public class TestDataBuilderForAddPlace {
	
	
	public AddPlace addPlacePayload(String name , String language, String address)
	{
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("01216545");
		p.setWebsite("https://facebook.com");
		p.setName(name);
		
		List<String> typeList = new ArrayList<String>();
		typeList.add("shoe park");
		typeList.add("shop");
		p.setTypes(typeList);
		
		Location Loc = new Location();
		Loc.setLat(-38.383494);
		Loc.setLng(33.427362);
		p.setLocation(Loc);
		
		return p;
		
	}
	
	

}
