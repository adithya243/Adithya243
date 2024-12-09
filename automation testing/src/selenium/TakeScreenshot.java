package selenium;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.netflix.com");
	Date d=new Date();
	String d1 = d.toString().replace(":", "-");
	System.out.println(d1);
	WebElement usn=driver.findElement(By.xpath("//input[@id=':r0:']"));
	File tem = usn.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshot/Defect02.png");
	FileHandler.copy(tem, perm);
	Thread.sleep(2000);
	driver.quit();
	
}
}
