package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_Rightclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	WebElement fashion=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.moveToElement(fashion).perform();
	
}
}
