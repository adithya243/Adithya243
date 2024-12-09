package facebooktestCase_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_1 extends Facebook_testCase{
@Test
public void username()
{
	WebElement usn = driver.findElement(By.id("email"));
	usn.sendKeys("radmin");
	WebElement pws=driver.findElement(By.id("pass"));
	pws.sendKeys("admin@1234");
	driver.navigate().refresh();
	WebElement usn1 = driver.findElement(By.id("email"));
	usn.sendKeys("radmin");
	WebElement pws1=driver.findElement(By.id("pass"));
	pws.sendKeys("admin@1234");
	
}

}
