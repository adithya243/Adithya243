package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/HP/Desktop/Selenium/dummypage.html");
	 WebElement fub = driver.findElement(By.id("f"));
	 fub.sendKeys("C:\\Users\\HP\\Pictures\\usablity defect.PNG");
	 
}
}
