package pageObjectModelExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	
	private WebDriver driver;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By myAccLink = By.linkText("My Account");
	By usernameTxt = By.name("email_address");
	By passwordTxt = By.name("password");
	By signinbtn = By.id("tdb5");
	
	public LoginPOM clickMyAccLink()
	{
		driver.findElement(myAccLink).click();
		return this;
		
	}
	
	public LoginPOM enterUsernamePassword(String name, String password)
	{
		driver.findElement(usernameTxt).sendKeys(name);
		driver.findElement(passwordTxt).sendKeys(password);
		return this;
	}
	
	
	
	public LoginPOM clickSigninbutton()
	{
		driver.findElement(signinbtn).click();
		return this;
	}

}
