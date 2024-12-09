package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/HP/Desktop/Selenium/CheckBox2.html");
	List<WebElement> cb=driver.findElements(By.xpath("//input"));
	int count=cb.size();
	for(int i=0;i<count;i++)
	{
		if(i%2==1) {
			WebElement link=cb.get(i);
		link.click();
		}
	
		for(int j=count;j>0;j--)
		{
		if(j%2==1)
		{
			WebElement links=cb.get(j);
			links.click();
		}
		}
	}	
	Thread.sleep(2000);
	driver.quit();
}

}
