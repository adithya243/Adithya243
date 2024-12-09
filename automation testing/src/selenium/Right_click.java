package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
public static void main(String[] args) throws AWTException, InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com");
	WebElement cart=driver.findElement(By.xpath("//a[.='Cart']"));
	Actions a=new Actions(driver);
	a.contextClick(cart).perform();
         Robot r=new Robot();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}
}
