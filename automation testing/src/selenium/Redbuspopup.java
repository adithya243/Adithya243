package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuspopup {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.redbus.com");
	 Thread.sleep(1000);
	WebElement fup = driver.findElement(By.id("date-box"));
	fup.click();
	Thread.sleep(1000);
	WebElement cp = driver.findElement(By.xpath("(//span[.='22'])[1]"));
	cp.click();
	 
}
}
