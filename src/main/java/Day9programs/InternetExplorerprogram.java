package Day9programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='200%';");
		driver.get("http://www.5elementslearning.dev/demosite");
		driver.close();

	}

}
