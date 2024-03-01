package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	driver.findElement(By.id("email"));
//	driver.findElement(By.tagName("div"));
//	driver.findElement(By.name("namees"));
		// Thread.sleep(3000);
		// driver.findElement(By.linkText("New Browser Window")).click();
		// driver.findElement(By.partialLinkText("New Browser Window")).click();
		driver.findElement(By.xpath("//button[text()=\"New Browser Window\"]")).click();

		driver.close();

	}
}
