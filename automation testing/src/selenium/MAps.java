package selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAps {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/maps/@13.0012817,77.5487917,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
	WebElement dri=driver.findElement(By.xpath("//span[@aria-hidden='true'and @style='font-size: 24px'and @class='google-symbols NhBTye G47vBd']"));
	dri.click();
	Thread.sleep(2000);
	WebElement loca=driver.findElement(By.xpath("//input[@class='tactile-searchbox-input'and @ autocomplete='off'and @dir='ltr'and @spellcheck=\"false\"]"));
	loca.sendKeys("rajajinagar");
	WebElement de=driver.findElement(By.xpath("//div[@id='sb_ifc51']"));
	de.sendKeys("karaikudi");
}
}
