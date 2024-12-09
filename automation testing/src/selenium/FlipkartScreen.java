package selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartScreen {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://ajio.com");
	  List<WebElement> flip = driver.findElements(By.xpath("//img"));
	  int fli = flip.size();
	  for(int i=1;i<fli;i++) {
		  WebElement f = flip.get(i);
		  File temp = f.getScreenshotAs(OutputType.FILE);
		  File perm= new File("./Screenshot/"+i+"Element.png");
		  FileHandler.copy(temp, perm);
		 
		 
		  
		  
		 
		  
		  
	  }
}
}
