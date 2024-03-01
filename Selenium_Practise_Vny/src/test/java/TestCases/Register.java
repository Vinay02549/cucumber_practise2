package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_pack.Base;

public class Register extends Base {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = InitializeBrowser();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@Test
	public void RegisterWithMandaatoryFields() {

		driver.findElement(By.id("input-firstname")).sendKeys("vinay");
		driver.findElement(By.id("input-lastname")).sendKeys("dikonda");
		driver.findElement(By.id("input-email")).sendKeys(Base.Timestamp());
		driver.findElement(By.id("input-telephone")).sendKeys("12344567890");
		driver.findElement(By.id("input-password")).sendKeys("vny@123");
		driver.findElement(By.id("input-confirm")).sendKeys("vny@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String Successmsg = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		Assert.assertEquals(Successmsg, "Your Account Has Been Created!");

	}

	@Test
	public void RegisterWithAllFields() {
		driver.findElement(By.id("input-firstname")).sendKeys("vinay");
		driver.findElement(By.id("input-lastname")).sendKeys("dikonda");
		driver.findElement(By.id("input-email")).sendKeys(Base.Timestamp());
		driver.findElement(By.id("input-telephone")).sendKeys("12344567890");
		driver.findElement(By.id("input-password")).sendKeys("vny@123");
		driver.findElement(By.id("input-confirm")).sendKeys("vny@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String Successmsg = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		Assert.assertEquals(Successmsg, "Your Account Has Been Created!");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

	
	}

