package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/v1/");
	WebElement UN = driver.findElement(By.id("user-name"));
	 UN.sendKeys("standard_user");
	 WebElement PWD=driver.findElement(By.id("password"));
	 PWD.sendKeys("secret_sauce");
	 WebElement Log=driver.findElement(By.id("login-button"));
	 Log.click();
	 WebElement Product=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
	 Product.click();
	 Thread.sleep(2000);
	 WebElement pro=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
	 String pr= pro.getText();
	 System.out.println(pr);
	 Thread.sleep(2000);
	 WebElement p=driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
	 String price = p.getText();
	   String pi = price.replace("$", "");
	 System.out.println(pi);
	 Thread.sleep(2000);
	 WebElement cart=driver.findElement(By.xpath("//button[.='ADD TO CART']"));
	 cart.click();
	 WebElement cart1=driver.findElement(By.id("shopping_cart_container"));
	 cart1.click();
	 Thread.sleep(1000);
	 WebElement p1=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	 String price1 = p1.getText();
	 System.out.println(price1);
	 Thread.sleep(2000);
	 WebElement p2=driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
	 String price2 = p2.getText();
	 System.out.println(price2);
	 Thread.sleep(2000);
	 if(pr.equals(price1) &&pi.equals(price2))
	 {
		 System.out.println("the values are matching");
	 }
	 else {
		 System.out.println("the values are not matching");
	 }
	 WebElement bin=driver.findElement(By.xpath("//button[.='Open Menu']"));
	 bin.click();
	 Thread.sleep(1000);
	 WebElement log=driver.findElement(By.id("logout_sidebar_link"));
	 log.click();

}

}
