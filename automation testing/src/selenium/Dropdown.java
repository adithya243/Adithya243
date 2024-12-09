package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/HP/Desktop/Selenium/Dropdown.html");
	 WebElement dd=driver.findElement(By.id("celebrities"));
	 Select s=new Select(dd);
	 if(s.isMultiple())
	 {
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(1000);
		s.deselectAll();
	 }
	 else
	 {
		 System.out.println("the drop down is single select");
	 }
}
}
