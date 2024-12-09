package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	int count=links.size();
	for(int i=0;i<count;i=i+2)
	{
		WebElement link=links.get(i);
		String txt=link.getText();
		System.out.println(i+" "+txt);
	}
	Thread.sleep(2000);
	driver.quit();
}
}
