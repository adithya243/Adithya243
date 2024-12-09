package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="email")
	 private WebElement usn;
	@FindBy(id="pass")
	private WebElement pws;
	@FindBy(name="login")
	private WebElement login;
	public Loginpage(WebDriver driver)
	{ 
		PageFactory.initElements(driver, this);
	}
}
