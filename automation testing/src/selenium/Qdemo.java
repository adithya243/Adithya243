package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Qdemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	Thread.sleep(2000);
	WebElement yes1=driver.findElement(By.xpath("(//button[.='Yes'])[1]"));
	yes1.click();
	
	Thread.sleep(2000);
	WebElement yes2=driver.findElement(By.xpath("(//button[.='Yes'])[2]"));
	yes2.click();
	
	Thread.sleep(2000);
	WebElement no1=driver.findElement(By.xpath("//button[.='1']"));
	no1.click();
	
	Thread.sleep(2000);
	WebElement no2=driver.findElement(By.xpath("//button[.='2']"));
	no2.click();
	Thread.sleep(2000);
	WebElement no3=driver.findElement(By.xpath("//button[.='3']"));
	no3.click();
	Thread.sleep(2000);
	WebElement no4=driver.findElement(By.xpath("//button[.='4']"));
	no4.click();
	Thread.sleep(2000);
	WebElement no5=driver.findElement(By.xpath("//button[.='5']"));
	no5.click();
}
}
