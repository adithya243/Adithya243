package BasicFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenricScript {
	
	@BeforeMethod
	public void  Facebook()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}
	@AfterMethod
	public void face()
	{
		WebDriver driver = null;
		driver.close();
	}
	
	
}
