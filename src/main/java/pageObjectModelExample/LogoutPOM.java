package pageObjectModelExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPOM {
	
	private WebDriver driver;
	
	public LogoutPOM(WebDriver driver)
	{
		this.driver=driver;
	}

	By Logoffbtn = By.linkText("Log Off");
	By continuebtn = By.xpath("//span[contains(text(),'Continue')]");
	
	public LogoutPOM clickonLogOffbtn()
	{
		driver.findElement(Logoffbtn).click();
		return this;
	}
	
	public LogoutPOM clickonContinuebtn()
	{
		driver.findElement(continuebtn).click();
		return this;
	}
}
