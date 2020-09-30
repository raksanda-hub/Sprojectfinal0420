package Com.nexttech.stepdefs;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import Com.nexttech.pageobjectmodel.Coursecontent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mrboolcourses {
	WebDriver driver;
	@Given("^user visit the homepage of MRBOOL$")
	public void user_visit_the_homepage_of_MRBOOL() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C://Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://mrbool.com/");
		

	}

	@When("^user move cursor on content$")
	public void user_move_cursor_on_content() throws Throwable {
		Coursecontent obj2= new Coursecontent (driver);
		// obj2.Content().click();
		 Actions act=new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"))).build().perform();
		 
		 
	}

	@When("^user click on Courses$")
	public void user_click_on_Courses() throws Throwable {
		Coursecontent obj2= new Coursecontent (driver);
		Actions act=new Actions(driver);
		obj2.Courses().click();
		
		
		
		
	}

	@Then("^user will able to see all the courses they offer$")
	public void user_will_able_to_see_all_the_courses_they_offer() throws Throwable {
	    
	}



}
