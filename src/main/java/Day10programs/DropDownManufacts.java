package Day10programs;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.Assert;


public class DropDownManufacts {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void browseManufacturers() throws Exception
	{
		driver.get("http://www.5elementslearning.dev/demosite");
		Select manufacts = new Select(driver.findElement(By.xpath("//select[@name='manufacturers_id']")));
		List<WebElement> names = manufacts.getOptions(); // get all options from the Manufacturers drop down
		ArrayList<String> namesofman = new ArrayList<String>(); // use an Array List 
		for(WebElement ele:names)
		{
			namesofman.add(ele.getText()); // print out the list of Manufacturers
		}
		namesofman.remove(0); // remove the "Please Select" value
		System.out.println("The list of Manufacturers are " +namesofman);
		manufacts.selectByVisibleText("Hewlett Packard"); // Select HP
		driver.findElement(By.tagName("table"));
		List<WebElement> allRows = driver.findElements(By.xpath("//tbody/tr"));
		for(WebElement row:allRows)
		{
			List<WebElement> allCols=driver.findElements(By.xpath("td"));
			System.out.println(row.getText()); // print out the Product available for HP
			
		}
		
		for(String manname: namesofman)
		{
			
			manufacts = new Select(driver.findElement(By.xpath("//select[@name='manufacturers_id']")));
			manufacts.selectByVisibleText(manname);
			//int array[];
			
		if(driver.getPageSource().contains("There are no products available in this category."))
		{
			
			System.out.println("Manufacturer "+manname+ " has 0 products");
		}
		else
		{
			WebElement prodTable=driver.findElement(By.className("productListingHeader"));
			List<WebElement> allRows1 = prodTable.findElements(By.xpath("//tbody/tr"));

			
			System.out.println("Manufacturer: "+manname+" has products: "+(allRows1.size()-1)); // it is taking into account product header as well, so size minus 1
			int array[]= {allRows1.size()-1};
			int max=array[0];
			for(int i =0;i<array.length;i++)
			{
				
				if(array[i]>max)
				{
					max=array[i];
				}
			}
			System.out.println("Maximum products is "+max+" for "+ manname); // printing the maxium number of products and its correpsonding manufacturer
		}
		}
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	

}
