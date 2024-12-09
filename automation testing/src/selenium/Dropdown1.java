package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/HP/Desktop/Selenium/Dropdown.html");
	 WebElement dd=driver.findElement(By.id("celebrities"));
	 Select s=new Select(dd);
	 List<WebElement> opts = s.getOptions();
	 int optscount=opts.size();
	 System.out.println(optscount);
	 Thread.sleep(2000);
	 ArrayList<String> arr=new ArrayList<String>();
	 for(int i=0;i<optscount;i++)
	 {
		WebElement opt = opts.get(i);
		String txt =opt.getText();
		arr.add(txt);
		//System.out.println(txt);
		
		
	 }
	 Collections.sort(arr,Collections.reverseOrder());
	 for(String ar:arr)
	 {
		 System.out.println(ar);
	 }
	  Thread.sleep(2000);
	  driver.quit();
}
}
