package Com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Com.nexttech.pageobjectmodel.Deskdell;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class desktopdl {
	WebDriver driver;
	@Given("^user open homepage$")
	public void user_open_homepage() throws Throwable {
		try {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32 (3)//chromedriver.exe");     
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.dell.com/en-us");
		}
		catch (Exception e) {
			System.out.println("homepage didn't  open");
		}
	
	}

	@When("^user redirecting product and desktop menu and user click for business$")
	public void user_redirecting_product_and_desktop_menu_and_user_click_for_business() throws Throwable {
		try {
		Deskdell Dk= new Deskdell (driver) ;
		Actions act= new Actions (driver);
		act.moveToElement(Dk.dropdownmenu_products()).build().perform();
		Dk.dropdownmenu_products().click();
		act.moveToElement(Dk.dropdownmenu_Desktops()).build().perform();
		Dk.dropdownmenu_Desktops().click();
		Dk.Click_For_Business().click();
	
		
		}
		catch (Exception e) {
			System.out.println("dropdownmenu is not working");
		}
	}

	@Then("^user will see desktops for business$")
	public void user_will_see_desktops_for_business() throws Throwable {
		
	    
	}

	

}
