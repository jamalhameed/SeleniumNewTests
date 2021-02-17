package Day10programs;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.Assert;

public class CategoryProgram {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void pickCategories()
	{
		driver.get("http://www.5elementslearning.dev/demosite");
		driver.findElement(By.xpath("//a[normalize-space()='Hardware->']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='New Products For February']"));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
		
	
		List<WebElement> allCols1=driver.findElements(By.xpath("//td[1]"));
		List<WebElement> allCols2=driver.findElements(By.xpath("//td[2]"));
		List<WebElement> allCols3=driver.findElements(By.xpath("//td[3]"));
		ArrayList<String> newarray = new ArrayList<String>();
		//newarray.add(allCols1.toString());
		//newarray.add(allCols2.toString());
		//newarray.add(allCols3.toString());*/
		
	    for(WebElement ele:allCols1)
		{
			
	    	//System.out.println(ele.getText());
	    	newarray.add(ele.getText());
			
			
		}
	    
	    for(WebElement ele1:allCols2)
	    {
	    	//System.out.println(ele1.getText());
	    	newarray.add(ele1.getText());
	    }
			
	    for(WebElement ele2:allCols3)
	    {
	    	//System.out.println(ele2.getText());
	    	newarray.add(ele2.getText());
	    }
	   // newarray.remove(0);
	  //  newarray.remove(1);
	    
	 
	  newarray.remove(0);	
	  newarray.remove(1);
	  //newarray.remove(2);
	  newarray.remove(3);
	  newarray.remove(4);
	  for (int i=0;i<newarray.size();i++)
	    {
           System.out.println("The array elements are ");
	    	System.out.println(newarray.get(i));
	   }
	}

}
