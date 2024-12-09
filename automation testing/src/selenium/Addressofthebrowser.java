package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addressofthebrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	 Thread.sleep(2000);
	 WebElement cli = driver.findElement(By.xpath("//button[@id='browserButton2']"));
	 cli.click();
	 Set<String> wins = driver.getWindowHandles();
	 int count=wins.size();
	 System.out.println(count);
	 String winss = driver.getWindowHandle();
	 System.out.println(winss);
	 System.out.println();
	 for(String win:wins )
	 {
		 System.out.println(win);
	 }
}
}
