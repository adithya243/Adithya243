package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com");
	 Thread.sleep(1000);
	 WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	 search.click();
	 search.sendKeys("iphone11");
	 Thread.sleep(1000);
	 WebElement searchicon = driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
	 searchicon.click();
	 Thread.sleep(1000);
	 WebElement casco = driver.findElement(By.xpath("(//img[@loading='eager'])[1]"));
	 casco.click();
	 Thread.sleep(1000);
	 WebElement leather = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 leather.click();
	 driver.switchTo().window(null);
	 Thread.sleep(1000);
     WebElement login = driver.findElement(By.xpath("//input[@maxlength='auto']"));
     login.sendKeys("6369695484");
     Thread.sleep(3000);
     //driver.quit();
}
}
