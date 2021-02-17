package Day10programs;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.io.*;


public class NestedFrames {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void clickondraggable() throws InterruptedException, IOException
	{
	driver.get("https://jqueryui.com/droppable/");
	 
	driver.findElement(By.linkText("Draggable")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	String text = driver.findElement(By.xpath("//div[@id='draggable']")).getText();
	System.out.println("The text associated with the draggable element is "+text);
	//Actions act = new Actions(driver);
	//act.build().perform();
	//act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	//Thread.sleep(2000);
	
	}
	@After
	public void tearDown()
	{
		driver.close();
	}

}
