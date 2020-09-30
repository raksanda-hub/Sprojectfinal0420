package Com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.nexttech.pageobjectmodel.SignIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	WebDriver driver;	
	
	
@Given("^user visit homepage$")
	public void user_visits_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver","C://Program Files\\chromedriver_win32\\chromedriver.exe");
		  //"driver name","path of driver"
		  driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  driver.get("https://demo.oscommerce.com");
		}
		catch (Exception e) {
			System.out.println("browser & url not working");
		}
}
		  
@Given("^click My Account button$")
 public void click_My_Account_button() throws Throwable {

		SignIn obj1=new SignIn(driver);
		obj1.MyAccount().click();
		Thread.sleep(2000);
		}
	    
	

@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2) throws Throwable {
    SignIn obj1=new SignIn(driver);
    obj1.EmailAddress().sendKeys(arg1);
    Thread.sleep(2000);
    obj1.password().sendKeys(arg2);
    Thread.sleep(5000);
}

@When("^user click on sign in button$")
public void user_click_on_sign_in_button() throws Throwable {
	
	SignIn obj1=new SignIn(driver);
	obj1.Signin().click();
    
}

@Then("^user successfully login to the system$")
public void user_successfully_login_to_the_system() throws Throwable {
	SignIn obj1=new SignIn(driver);
	obj1.myaccountinfo().click();
	
}

@Then("^user click on Log off Button for logout$")
public void user_click_on_Log_off_Button_for_logout() throws Throwable {
	SignIn obj1=new SignIn(driver);
	obj1.Logoff().click();
}
//@Sc2
@When("^user enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_invalid_and(String arg1, String arg2) throws Throwable {
    
}
}
