package StepDefinition;

import org.junit.Assert;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchSteps {

	Product product;
	Search search;

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_Amazon_Page() {
		System.out.println("Step 1: I am on Search Page");
	}
/*
 * here we are using the Regular Expressions... 
 * from url of OREILLY.com Short Hand Characters..!
 */
	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name : " + productName + " Price " + price);

		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product " + productName);

		search = new Search();
		String name = search.displayProduct(product);
		System.out.println("search product " + name);
		Assert.assertEquals(product.getProductName(), name);
	}

	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer id, String username) {
		System.out.println("user id : " + id + " " + "username " + username);
	}
}
