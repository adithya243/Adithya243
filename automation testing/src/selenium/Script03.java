package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script03 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/Selenium/youtube.html");
	WebElement usn=driver.findElement(By.cssSelector("input[type='text']"));
	usn.sendKeys("ADITHYA");
	WebElement cb=driver.findElement(By.cssSelector("input[type='checkbox']"));
	cb.click();
	WebElement rb=driver.findElement(By.cssSelector("input[type='radio']"));
	rb.click();
	WebElement link=driver.findElement(By.cssSelector("a[href='https://www.youtube.com']"));
	link.click();
}
}
