package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	
	@Given("User should launch URL")
	public void user_should_launch_url() {
		System.out.println("1213");
	}
	
	@When("User is able to enter login credentials and clicked on login button")
	public void user_is_able_to_enter_login_credentials_and_clicked_on_login_button() {
		System.out.println("1213");
	}
	
	
	@When("User is able to enter login credentials {string} and {string} and clicked on login button")
	public void user_is_able_to_enter_login_credentials_and_and_clicked_on_login_button(String string, String string2) {

		
		System.out.println(string);
		System.out.println(string2);
		
	}
	
	
	
	@Then("User should navigate to dashboard")
	public void user_should_navigate_to_dashboard() {
		System.out.println("1213");
	}
	
	@Then("clicked on logout button")
	public void clicked_on_logout_button() {
		System.out.println("1213");
	}	
	
	@Then("login page displayed = {string}")
	public void login_page_displayed(String string) {
	System.out.println("Login page displayed after logout");   
	}
	
}
