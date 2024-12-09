package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	WebElement search=driver.findElement(By.cssSelector("input[id='search']"));
	search.sendKeys(" tamil songs");
	WebElement sear=driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
	sear.click();
	WebElement sea=driver.findElement(By.id("['video-title\']"));
	sea.click();
}
}
