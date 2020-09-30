package Com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.nexttech.pageobjectmodel.LocationsHt;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hilLocations {
	WebDriver driver;
	
	@Given("^user navigates the homepage$")
	public void user_navigates_the_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32 (3)//chromedriver.exe"); 
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://hilton.com/en/");
		}
		catch (Exception e) {
			System.out.println("not working properly");
		}
		
		}

	@When("^user clicked on Locations$")
	public void user_clicked_on_Locations() throws Throwable {
		try {
		LocationsHt LocH=new   LocationsHt (driver) ;
		LocH.Locations().click();
		}
		catch(Exception e) {
			System.out.println("location page open error");
		}
	}

	@Then("^user must get Hilton  locations successfully$")
	public void user_must_get_Hilton_locations_successfully() throws Throwable {
	    
	}


}
