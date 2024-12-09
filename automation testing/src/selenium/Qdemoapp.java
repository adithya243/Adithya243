package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qdemoapp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromdriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("(//select[@id='select-multiple-native'])[1]");
}
}
