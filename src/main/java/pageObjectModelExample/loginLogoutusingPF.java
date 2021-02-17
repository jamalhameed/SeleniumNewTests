package pageObjectModelExample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
import org.junit.*;


public class loginLogoutusingPF {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//introduce a global time interval of 10 seconds
	}
	
	@Test
	public void loginLogout() throws Exception {
		
		driver.get("https://5elementslearning.dev/demosite");
		PageFactory.initElements(driver, LoginFact.class);
		PageFactory.initElements(driver, LogoutFact.class);
		
		LoginFact.myaccnt_link.click();
		LoginFact.username_txtbx.sendKeys("jamal@gmail1.com");
		LoginFact.passwd_txtbx.sendKeys("jingle123");
		LoginFact.signin_btn.click();
		
		LogoutFact.logoff_link.click();
		LogoutFact.continue_btn.click();
		
}
	@After
	public void TearDown()
	{
		driver.close();
	}



}
