package Day10programs;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.Assert;


public class WebTableDemo {

	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void mainpageProducts()
	{
		driver.get("http://www.5elementslearning.dev/demosite");
		WebElement prodTable = driver.findElement(By.tagName("table"));
		List<WebElement> allRows = driver.findElements(By.xpath("//tbody/tr"));
		for(WebElement row:allRows)
		{
			List<WebElement> allCols=driver.findElements(By.xpath("td"));
			System.out.println(row.getText());
			
		}
	}
	@After
	public void tearDown()
	{
		driver.close();
	}
}
