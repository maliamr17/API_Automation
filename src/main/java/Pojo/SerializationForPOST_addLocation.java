package Pojo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class SerializationForPOST_addLocation {

	public static void main(String[] args) {
		
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setName("Frontline house");
		p.setPhone_number("(+91) 983 893 3937");
		p.setAddress("29, side layout, cohen 09 Street No.1");
		p.setWebsite("website");
		p.setLanguage("French-IN");
		
		List<String> typeList = new ArrayList<String>();
		typeList.add("shoe park");
		typeList.add("shop");
		p.setTypes(typeList);
		
		Location Loc = new Location();
		Loc.setLat(-38.383494);
		Loc.setLng(33.427362);
		p.setLocation(Loc);
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response =given().queryParam("key", "qaclick123")
		.body(p)
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		.toString();
		
		System.out.println(response);
		
		
	}

}
