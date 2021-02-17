package Day9programs;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;

public class BuyProductsScenario {
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
	fos=new FileReader("datafiles\\logindata.txt");
	reader = new BufferedReader(fos);
	String line="";
	
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.name("email_address")).clear();
	driver.findElement(By.name("email_address")).sendKeys("jamal@gmail1.com");
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("jingle123");
	driver.findElement(By.id("tdb5")).click();
	
	while((line = reader.readLine())!=null)
	{
	
	String [] data = line.split(";");
	
    for(int i=0;i<data.length;i++)
    {
    	
    	driver.findElement(By.xpath("//input[@name='keywords']")).clear();	
	driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys(data[i]);
	driver.findElement(By.xpath("//input[@title=' Quick Find ']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Buy Now')]")).click();
    }
    driver.findElement(By.xpath("//span[text()='Checkout']")).click();
    driver.findElement(By.xpath("//span[text()='Continue']")).click();
    
    driver.findElement(By.xpath("//input[@name='payment']")).click();
    driver.findElement(By.xpath("//span[text()='Continue']")).click();
    driver.findElement(By.id("tdb5")).click();
    driver.findElement(By.xpath("//span[text()='Continue']")).click();
	}

	}


	@After
	public void tearDown()
	{
		driver.close();

	}

	

}


