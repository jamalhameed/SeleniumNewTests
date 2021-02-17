package pageObjectModelExample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
import org.junit.*;


public class LoginandChangeProfilePOM {
	
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginandUpdateprofile() throws Exception
	{
		driver.get("http://www.5elementslearning.dev/demosite");
		LoginPOM loginobj = new LoginPOM(driver);
		loginobj.clickMyAccLink();
		loginobj.enterUsernamePassword("jamal@gmail1.com", "jingle123");
		loginobj.clickSigninbutton();
		ChangeProfilePOM changeprofileobj = new ChangeProfilePOM(driver);
		changeprofileobj.clickonvieworChangeProfile();
		changeprofileobj.updateLastNamefield("Hameed2");
		changeprofileobj.clickonContinuebutton();
		
		LogoutPOM logoutobj = new LogoutPOM(driver);
		logoutobj.clickonLogOffbtn();
		logoutobj.clickonContinuebtn();
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}

}
