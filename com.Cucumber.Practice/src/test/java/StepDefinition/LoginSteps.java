package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
	    System.out.println("user is in login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   System.out.println(" user enters the username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println(" user clicking on the login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println(" user should land on home page");
	}
}
