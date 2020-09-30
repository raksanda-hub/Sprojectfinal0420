package Com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.nexttech.pageobjectmodel.Htoffers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class offershilton {
	WebDriver driver;
	
	@Given("^user opening the homepage$")
	public void user_opening_the_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32 (3)//chromedriver.exe"); 
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		  driver.get("https://hilton.com/en/");	
		}
		catch (Exception e) {
			System.out.println("something going wrong");
		}
	    
	}

	@When("^user clicking on offers$")
	public void user_clicking_on_offers() throws Throwable {
		try {
		Htoffers hoff= new Htoffers (driver);
		hoff.Offers().click();
		}
		catch (Exception e) {
			System.out.println("Hiltons offers page is not open");
		}
	}

	@Then("^user would see all the offers of Hilton$")
	public void user_would_see_all_the_offers_of_Hilton() throws Throwable {
	    
	}

	

}
