package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class If {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:///C:/Users/HP/Desktop/Selenium/usna.html");
	WebElement usn=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	Thread.sleep(2000);
	if(usn.isDisplayed())
	{
		if(usn.isEnabled())
		{
			
		if(usn.isSelected())
		{
			Thread.sleep(3000);
		    usn.sendKeys("adithya");
	}
		else
		{
			System.out.println("it is not selected" );
		}
		}
	else {
		System.out.println("it is not enabled");
	}
	}
	else {
		System.out.println("its is not displayed");
	}
}
}
