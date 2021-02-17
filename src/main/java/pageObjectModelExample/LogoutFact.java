package pageObjectModelExample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutFact {
	
	@FindBy(how=How.LINK_TEXT, using="Log Off")
	public static WebElement logoff_link;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Continue')]")
	public static WebElement continue_btn;
	
	
	
	

}
