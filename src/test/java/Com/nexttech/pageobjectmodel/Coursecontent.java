package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coursecontent {
	
	WebDriver driver;
	
	public Coursecontent (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
@FindBy(xpath="\"//*[@id=\\\"headermenudesktop\\\"]/ul/li/a\"")

WebElement dropdown_content;
public  WebElement Content() {
	return dropdown_content;
	
	}

@FindBy(xpath="//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")
WebElement Click_Courses;
public WebElement Courses() {
	return Click_Courses;
	
}
}
