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

public class DVDMoviesActionsprogram {
	
	WebDriver driver;
	WebDriverWait wait;
	FileReader fos;
	BufferedReader reader;

	@Before
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void loginandsearchproducts() throws InterruptedException, IOException
	{
	driver.get("http://www.5elementslearning.dev/demosite");
	
	wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account")));
	 driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).clear();
		driver.findElement(By.name("email_address")).sendKeys("jamal@gmail1.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("jingle123");
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.xpath("//a[normalize-space()='DVD Movies->']")).click(); 
		driver.findElement(By.xpath("//a[normalize-space()='Action']")).click();
		//Select manufacts=new Select(driver.findElement(By.name("manufacturers_id")));
		WebElement table = driver.findElement(By.className("productListingHeader"));
		List<WebElement> allRows = table.findElements(By.xpath("//tbody/tr"));
		for(WebElement row:allRows) {
		List<WebElement> allCols = row.findElements(By.xpath("td"));
		
		for(WebElement col:allCols) {
		System.out.println(col.getText());
		}
		
	}
	
}
}

