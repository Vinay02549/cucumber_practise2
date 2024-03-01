package practise;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3 {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		List<WebElement> drpdwnlist = dropdown.findElements(By.xpath("//select/option"));
		for (WebElement list : drpdwnlist) {
			System.out.println(list.getText());
		}

		FileInputStream getExcel = new FileInputStream(".//src//main//java//testData//testdata_1.xlsx");
		XSSFWorkbook book1 = new XSSFWorkbook(getExcel);
		XSSFSheet sheet1 = book1.createSheet("Sheet2");
		for (int i = 0; i < drpdwnlist.size(); i++) {
			XSSFCell cell = sheet1.createRow(i).createCell(0);
			cell.setCellValue(drpdwnlist.get(i).getText());
		}

		driver.close();
	}

}
