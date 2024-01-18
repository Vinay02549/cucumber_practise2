package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("user wants to select a car type {string} from uber application")
	public void user_wants_to_select_a_car_type_sedon_from_uber_application(String carType) {
		System.out.println("Step 1 : " + carType);
	}

	@When("user selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String carType, String pickupLocation,
			String DropLocation) {
		System.out.println("Step 2 : " + carType + " " + pickupLocation + " " + DropLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3 Started Journey");
	}

	@And("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4 Ended Journey");
	}

	@Then("user pays {int} USD")
	public void user_pays_USD(Integer price) {
		System.out.println("Step 5 : " + " " + price);
	}
}
