package practise;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		// System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test
	public void loginwithvalidcredentials() {
		// System.setProperty("WebDriver.chrome.driver","chromedriver.exe");

		driver.findElement(By.id("input-email")).sendKeys("vinay.marolix@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Tester@55");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());

	}

	@Test
	public void loginwithemptyfields() {
		// System.setProperty("WebDriver.chrome.driver","chromedriver.exe");

		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errormessage = driver.findElement(By.xpath("//div[contains(@class , 'alert-dismissible')]")).getText();
		Assert.assertEquals(errormessage, "Warning: No match for E-Mail Address and/or Password.");

	}

	public void loginwithinvalidemailid() {
		// System.setProperty("WebDriver.chrome.driver","chromedriver.exe");

		driver.findElement(By.id("input-email")).sendKeys("vinay" + timestamp() + "@gmail.com ");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errormessage = driver.findElement(By.xpath("//div[contains(@class , 'alert-dismissible')]")).getText();
		Assert.assertEquals(errormessage, "Warning: No match for E-Mail Address and/or Password.");

	}

	public String timestamp() {

		Date date = new Date();

		String datetext = (date.toString().replace(" ", "_").replace(":", "_"));
		return datetext;

	}

	@AfterMethod
	public void shutdown() {
		driver.quit();
	}
}
