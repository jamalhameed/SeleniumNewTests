package pageObjectModelExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ChangeProfilePOM {
	
	private WebDriver driver;
	
	public ChangeProfilePOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By vieworchangeprofilelink = By.xpath("//a[contains(.,'View or change my account information')]");
	By lastnamefield = By.xpath("//input[@name='lastname']");
	By continuebutton = By.xpath("//*[@id='tdb5']/span[1]");
	
	public ChangeProfilePOM clickonvieworChangeProfile()
	{
		driver.findElement(vieworchangeprofilelink).click();
		return this;
	}
	
	public ChangeProfilePOM updateLastNamefield(String updatedlastname)
	{
		driver.findElement(lastnamefield).clear();
		driver.findElement(lastnamefield).sendKeys(updatedlastname);
		return this;
	}
	public ChangeProfilePOM clickonContinuebutton()
	{
		driver.findElement(continuebutton).click();
		return this;
	}

}
