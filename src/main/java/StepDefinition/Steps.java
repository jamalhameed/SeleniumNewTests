package StepDefinition;

//import cucumber.api.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Steps {
	WebDriver driver;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() 
	{
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		throw new cucumber.api.PendingException();
	}
	
	@When("^user navigates to login page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new cucumber.api.PendingException();
	}

	@When("user enters <username> and <password>")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("message displayed login successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
