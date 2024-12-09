package selenium;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlflipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com");
	 List<WebElement> links = driver.findElements(By.xpath("//a"));
	 int nooflinks=links.size();
	 XSSFWorkbook book=new XSSFWorkbook();
	
}
}
