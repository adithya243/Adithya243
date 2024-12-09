package data_driver_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readsingledata {
public static void main(String[] args) throws Exception {
	FileInputStream  fis=new FileInputStream("./Testdata/FacebookCretendial.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(0);
	XSSFCell cell1=row.getCell(1);
	String val=cell.getStringCellValue();         //button[@id='loginbutton']
	String val1=cell1.getStringCellValue();
	System.out.println(val);
	System.out.println(val1);
	workbook.close();
	fis.close();
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	Thread.sleep(2000);
	WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
	un.sendKeys(val);
	Thread.sleep(1000);
	WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
	pwd.sendKeys(val1);
	Thread.sleep(1000);
	WebElement log=driver.findElement(By.id("loginbutton"));
	log.click();
}
}
