package Day8programs;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ChangeProfileScenario {




WebDriver driver;

@Before
public void setup()
{
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void loginLogout() throws InterruptedException
{
driver.get("http://www.5elementslearning.dev/demosite");
Thread.sleep(3000);
driver.findElement(By.linkText("My Account")).click();
driver.findElement(By.name("email_address")).clear();
driver.findElement(By.name("email_address")).sendKeys("jamal@gmail1.com");
driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys("jingle123");
driver.findElement(By.id("tdb5")).click();
driver.findElement(By.xpath("//a[contains(.,'View or change my account information')]")).click();
driver.findElement(By.xpath("//input[@name='lastname']")).clear();
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hameed2");
driver.findElement(By.xpath("//*[@id='tdb5']/span[1]")).click();

Assert.assertTrue("Your account has been successfully updated", true);
driver.findElement(By.xpath("//span[contains(text(),'Log Off')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();

}


@After
public void tearDown()
{
	driver.close();

}
}
