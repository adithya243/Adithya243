package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Companyquest {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 WebDriverWait wait=new WebDriverWait(driver, 10);
	 driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
	 WebElement from = driver.findElement(By.id("txtOriginGeneral"));
	 from.click();
	 Thread.sleep(2000);
	 WebElement cam = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
	cam.click();
	 Thread.sleep(1000);
	 WebElement desti = driver.findElement(By.id("txtDestinationGeneral"));
		desti.click();
		 WebElement desti1= driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
			desti1.click();
			Thread.sleep(1000);
			WebElement Date= driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
			Date.click();
			WebElement Date1= driver.findElement(By.xpath("//a[.='20']"));
			Date1.click();
			Thread.sleep(1000);
			WebElement Search= driver.findElement(By.id("btnBusSearchNewGeneral"));
			Search.click();
			Thread.sleep(1000);
			WebElement Search1= driver.findElement(By.xpath("(//b[.='SELECT'])[2]"));
			Search1.click();
			Thread.sleep(1000);
			WebElement proc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//div[@class='seat w-100'])[39]")));
			proc.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//WebElement Seat1= driver.findElement(By.xpath("((//div[@class='seat w-100'])[39]"));
		    //Seat1.click();
		    //Thread.sleep(1000);
		   // WebElement Seat2= driver.findElement(By.xpath("(//div[@class='seat w-100'])[40]"));
		   // Seat2.click();
		    
}
}
