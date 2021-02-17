package Day10programs;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.io.*;

public class MiddleFrameProgram {
	
WebDriver driver;
	
	@Before
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void middleframecontents() throws InterruptedException, IOException
	{
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.switchTo().frame(driver.findElement(By.name("frame-top"))); 
	driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
	String text = driver.findElement(By.id("content")).getText();
    System.out.println("The content of the middle frame is "+ text);
	}

}
