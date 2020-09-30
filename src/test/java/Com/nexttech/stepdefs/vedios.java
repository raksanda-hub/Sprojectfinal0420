package Com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Com.nexttech.pageobjectmodel.Singlevd;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class vedios {
	WebDriver driver;
	@Given("^user opens homepage$")
	public void user_opens_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C://Program Files\\chromedriver_win32\\chromedriver.exe"); 
		 driver= new ChromeDriver();
		  
		  driver.get("http://mrbool.com/");
	    
	}

	@When("^user redirects to content menu and user clicks on single vedios feature$")
	public void user_redirects_to_content_menu_and_user_clicks_on_single_vedios_feature() throws Throwable {
		Singlevd sv=new Singlevd (driver);
		Actions act=new Actions(driver);
		act.moveToElement(sv.dropdownmenu_content()).build().perform();
	    sv.dropdownmenu_content().click();
		
		
	}

	@Then("^user should successfully redirect to the single vedios page$")
	public void user_should_successfully_redirect_to_the_single_vedios_page() throws Throwable {
		Singlevd sv=new Singlevd (driver);
	    sv.Single_Vedios().click();
	}

	

}
