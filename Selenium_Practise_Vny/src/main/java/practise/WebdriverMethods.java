package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https:www.flipkart.com");
		String tittle = driver.getTitle();

		System.out.println("its a tittle : " + tittle);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.getPageSource();
		
		driver.quit();
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
