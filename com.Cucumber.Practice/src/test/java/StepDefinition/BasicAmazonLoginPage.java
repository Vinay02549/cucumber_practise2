package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAmazonLoginPage {
	
	public static WebDriver driver;
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
              element.click();
	System.out.println(" user should be on login page..!");
	}

	@When("user enters username in username text field")
	public void user_enters_username_in_username_text_field() throws InterruptedException {
	
		Thread.sleep(3000);
		System.out.println(" user should enter username in text feild..!");

		 WebElement elements = driver.findElement(By.id("ap_email"));
		 Thread.sleep(5000);
		 elements.sendKeys("vinaydikonda333@gmail.com");
	}

	
	@And("user click on continue button")
	public void user_click_on_continue_button() throws InterruptedException {

		System.out.println("user clicking on the submit button...!");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
	}

	@Then("user navigates to next page for entering  password in password text feild")
	public void user_navigates_to_next_page_for_entering_password_in_password_text_feild() throws InterruptedException {

		System.out.println("user navigating to entering to password...!");

		Thread.sleep(3000);
		driver.findElement(By.id("ap_password")).sendKeys("vinay@123");
	}

	@And("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {

		System.out.println("user should be clicking on the submit button...!");

		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("user navigates to home page {string}")
	public void user_navigates_to_home_page(String expectedHomePage) throws InterruptedException {

		System.out.println("user should land on home page...!");
		Thread.sleep(3000);
		//Assert.assertTrue(expectedHomePage.startsWith("Online Shopping site in India:"));
		System.out.println("Home Page displayed : ----- welcome to home page....");
	}
}
