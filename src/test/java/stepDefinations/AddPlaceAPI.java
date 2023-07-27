package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;
import Pojo.Location;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResourcesInEnum;
import resources.TestDataBuilderForAddPlace;
import resources.Utils;

public class AddPlaceAPI extends Utils {
	RequestSpecification res;
	public ResponseSpecification resspec;
	Response response;
	AddPlace p = new AddPlace();
	TestDataBuilderForAddPlace data = new TestDataBuilderForAddPlace();
	

	
	@Given("Add Place payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
	   res=given().spec(requestSpecification())
			   .body(data.addPlacePayload(name, language, address));
	
	}

	
	/*
	 * @When("User calls {string} with POST Http request") public void
	 * user_calls_with_post_http_request(String string) {
	 * 
	 * RestAssured.baseURI="https://rahulshettyacademy.com"; String response =
	 * given().queryParam("key", "qaclick123") .body(p)
	 * .when().post("maps/api/place/add/json")
	 * .then().assertThat().statusCode(200).toString();
	 * 
	 * 
	 * }
	 */
	
	
	@When("User calls {string} with {string} Http request")
	
	public void user_calls_with_http_request(String resources, String HttpMethod) {
		
	 APIResourcesInEnum APIHttpRequest = APIResourcesInEnum.valueOf(resources);
	 
	 resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON); 
	 response = res.when().post(APIResourcesInEnum.getResources);
		
	}

	@Then("Response in the API call is success and status code {int}")
	public void response_in_the_api_call_is_success_and_status_code(Integer int1) {
		
		
	}

	@Then("{string} is {string}")
	public void is(String KeyValue, String ExpectedValue) {
	    
	String res=response.toString();
	JsonPath js = new JsonPath(res);
	assertEquals(js.get(KeyValue), ExpectedValue);

	
	}

	
	
}
