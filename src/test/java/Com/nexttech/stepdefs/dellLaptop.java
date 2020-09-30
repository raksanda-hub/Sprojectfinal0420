package Com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Com.nexttech.pageobjectmodel.Ltopdell;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellLaptop {
	WebDriver driver;
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32 (3)//chromedriver.exe"); 
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://dell.com/en-us");
		}
		catch (Exception e) {
			System.out.println("its not works accordingly");
		}
	}

	@When("^user redirect to Laptops menu and click on for home$")
	public void user_redirect_to_Laptops_menu_and_click_on_for_home() throws Throwable {
		try {
		Ltopdell Lp= new Ltopdell (driver);
		Actions act=new Actions (driver);
		act.moveToElement(Lp.dropdownmenu_Laptops()).build().perform();
		Lp.dropdownmenu_Laptops().click();
		Lp.Click_For_Home().click();
		}
		catch (Exception e) {
			System.out.println("ddownmenu is not works");
		}
	}

	@Then("^user have a look of all the varities of Laptops$")
	public void user_have_a_look_of_all_the_varities_of_Laptops() throws Throwable {
	    
	}

	

}
