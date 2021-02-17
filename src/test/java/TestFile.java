import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
public class TestFile {
	
	public WebDriver driver;
	 
    @Test
	public void ChromeTest() {
		// TODO Auto-generated method stub
		
		String url = "https://www.google.com";
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.quit();
		

	}
    
    @Test
    public void FirefoxTest()
    {
    	String url1 = "https://www.google.com";
    	System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
    	driver = new InternetExplorerDriver();
    	driver.get(url1);
    	driver.quit();
    	
    }

}
