package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Dimension d= new Dimension(300, 440);
	driver.manage().window().setSize(d);
	Thread.sleep(3000);
	Point p=new Point(200, 440);
	driver.manage().window().setPosition(p);
}
}
