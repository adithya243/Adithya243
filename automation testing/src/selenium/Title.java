package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	 Thread.sleep(2000);
	 WebElement cli = driver.findElement(By.xpath("//button[@id='browserButton2']"));
	 cli.click();
	      Set<String> win = driver.getWindowHandles();
	      System.out.println(win);
	      ArrayList<String> arr=new ArrayList<String>();
	       int count=win.size();
	       Thread.sleep(2000);
	       for(int i=0;i<count;i++)
	       {
	    	   String wins=arr.get(i);
	    	   Thread.sleep(1000);
	    	   driver.switchTo().window(wins);
	    	   String title1 = driver.getTitle();
	    	   System.out.println(title1);
	    	   driver.close();
	       }
	       Thread.sleep(2000);
	       driver.quit();
}
}
