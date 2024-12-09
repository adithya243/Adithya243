package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sleniumdev {
public static void main(String[] args) throws Exception {

	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	
	JavascriptExecutor jsp=(JavascriptExecutor)driver;
	jsp.executeScript("window.scrollBy(0,300)");
	WebElement link1 = driver.findElement(By.xpath("//a[.='4.26.1 (October 30, 2024)']"));
    WebElement link2 = driver.findElement(By.xpath("(//a[.='4.26.0 (October 30, 2024)'])[3]"));
    WebElement link3= driver.findElement(By.xpath("((//a[.='4.26.0 (October 30, 2024)'])[1]"));
    WebElement link4= driver.findElement(By.xpath("(//a[.='4.26.0 (October 30, 2024)'])[2]"));
   // Set<String> wins = driver.getWindowHandles();
	ArrayList<WebElement> arr1=new ArrayList<WebElement>();
	arr1.add(link1);
	arr1.add(link2);
	arr1.add(link3);
	arr1.add(link4);
	Actions a=new Actions(driver);
	Thread.sleep(1000);
	int count =arr1.size();
	for(int i=1;i<count;i++)
	{
		WebElement win = arr1.get(i);
		a.contextClick(win).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
			
			
	
	
}
}
