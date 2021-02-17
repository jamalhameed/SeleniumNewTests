package Day10programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DemoLoginValid {
	
	WebDriver driver;
	  @Test
	  public void loginlogout() {
		  
		  driver.get("http://www.5elementslearning.dev/demosite");
		  driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.name("email_address")).clear();
			driver.findElement(By.name("email_address")).sendKeys("jamal@gmail1.com");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("jingle123");
			driver.findElement(By.id("tdb5")).click();
			
		  
		  
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  //driver.close();
	  }

}
