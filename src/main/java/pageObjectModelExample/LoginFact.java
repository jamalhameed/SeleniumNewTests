package pageObjectModelExample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginFact {
	
	@FindBy(how=How.LINK_TEXT, using="My Account")
	public static WebElement myaccnt_link;
	
	@FindBy(how=How.NAME, using="email_address")
	public static WebElement username_txtbx;
	
	@FindBy(how=How.NAME, using="password")
	public static WebElement passwd_txtbx;
	
	@FindBy(how=How.ID, using="tdb5")
	public static WebElement signin_btn;
	
	
}


