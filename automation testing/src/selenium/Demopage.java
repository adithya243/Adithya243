package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Demopage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui");
	WebElement name=driver.findElement(By.cssSelector("input[type='text']"));
	name.sendKeys("adithya");
	Thread.sleep(2000);
	WebElement emailid=driver.findElement(By.cssSelector("input[type='email']"));
	emailid.sendKeys("sadithya243@gmail.com");
	WebElement pwd=driver.findElement(By.cssSelector("input[type='password']"));
	pwd.sendKeys("adi#123adi");
	WebElement re=driver.findElement(By.cssSelector("button[type='submit']"));
	re.click();
	Thread.sleep(3000);
	driver.quit();
	}
}
