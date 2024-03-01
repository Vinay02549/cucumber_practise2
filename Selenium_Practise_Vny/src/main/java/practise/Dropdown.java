package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement dropdown1 = driver.findElement(By.id("option"));
		WebElement dropdown2 = driver.findElement(By.id("owc"));
		
//		Select sel = new Select(dropdown2);
//		if(sel.isMultiple()) {
//			System.out.println("it is Multi_select dropdown");
//		}
//		else {
//		System.out.println("it is not Multi_select dropdown");
//		}
	//	Select sel = new Select(dropdown);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();

	}

}
