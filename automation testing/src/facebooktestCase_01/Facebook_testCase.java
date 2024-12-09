package facebooktestCase_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Facebook_testCase {
	WebDriver driver;
@BeforeMethod
public void Facebook()
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.navigate().to("htttps://www.facebook.com");
	
}
@AfterMethod
public void Facebook2()
{
	driver.close();
}

}
