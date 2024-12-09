package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Facebook {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://facebook.com");
	 WebElement usn=driver.findElement(By.cssSelector("input[type='text']"));
	 usn.sendKeys("adithya");
	 WebElement psw=driver.findElement(By.cssSelector("input[type='password']"));
	 psw.sendKeys("adi#123adi");
	 WebElement log=driver.findElement(By.cssSelector(" button[value='1'"));
	 log.click();
	}
		
	}
