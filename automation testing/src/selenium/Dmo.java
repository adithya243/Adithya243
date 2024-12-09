package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmo {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com");
	WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
     String an=ele.getText();
     Thread.sleep(2000);
     
	System.out.println(an);
	
}
}
