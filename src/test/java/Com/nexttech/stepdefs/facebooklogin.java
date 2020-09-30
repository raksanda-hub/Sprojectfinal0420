package Com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.nexttech.pageobjectmodel.FbsignIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebooklogin {
	
	WebDriver driver;
	
@Given("^user visiting Facebook homepage$")
public void user_visiting_Facebook_homepage() throws Throwable {
	try {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (3)//chromedriver.exe");
	  //"driver name","path of driver"
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("https://facebook.com");
	}
	catch(Exception e) {
		System.out.println("Fb homepage didnt open");
	}
    
}

@When("^user enter vaid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_vaid_and(String arg1, String arg2) throws Throwable {
	try {
	FbsignIn objj=new FbsignIn(driver);
	objj.EmailAddress().sendKeys(arg1);
	WebDriverWait wait =new WebDriverWait(driver, 10);
    objj.password().sendKeys(arg2);
	}
	catch (Exception e) {
		System.out.println("email and Password typing error");
	}
    
		
}

@When("^user Click on Log In$")
public void user_Click_on_Log_In() throws Throwable {
	try {
	FbsignIn objj=new FbsignIn(driver);
	WebDriverWait wait1=new WebDriverWait(driver,10);
	objj.LogIn().click();
	}
	catch (Exception e) {
		System.out.println("its not login properly");
	}
    
}

@Then("^user will able to Log In to Facebook account$")
public void user_will_able_to_Log_In_to_Facebook_account() throws Throwable {
    
}



}
