package Base_pack;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;

	public WebDriver InitializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://tutorialsninja.com/demo/");
		return driver;
	}

	public static String Timestamp() {
		Date date = new Date();
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		// System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		String datetext = (date.toString().replace(" ", "_").replace(":", "_"));
		return datetext + "@gmail.com";

	}
}
