package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws Throwable {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		// driver.manage().timeouts().pageLoadTimeout(Duration.seconds));
		List<WebElement> links = driver.findElements(By.tagName("img"));
		for (WebElement link : links) {
			String url = link.getAttribute("src");
			verifyurl(url);
		}

	}

	public static void verifyurl(String url) throws Throwable {
		URL urllink = new URL(url);
		try {
			HttpURLConnection connection = (HttpURLConnection) urllink.openConnection();
			int responsecode = connection.getResponseCode();
			if (responsecode < 200 || responsecode >= 400) {
				System.out.println("brokenlinks " + url + "responsecode");
			} else {
				System.out.println("validlinks " + url + "responsecode");

			}
		} catch (IOException e) {
			System.out.println("exception while checking url" + e.getMessage());
		}
	}

}
