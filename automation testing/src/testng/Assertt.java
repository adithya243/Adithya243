package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertt {
	@Test
	public void Login()
	{

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		String Exceptitlle="Facebook – log in or sign up";
		String Acutaltitlle=driver.getTitle();
		Assert.assertEquals(Acutaltitlle,Exceptitlle);
		System.out.println(Acutaltitlle);
		driver.quit();
	}
}
