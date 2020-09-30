package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbsignIn {
	
WebDriver driver;

public FbsignIn (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy (name="email")
WebElement Type_EmailAddress;
public  WebElement EmailAddress() {
	return Type_EmailAddress;
	}

@ FindBy(name="pass")
WebElement type_password;
public  WebElement password() {
	return type_password;
	}

@FindBy(name="login")
WebElement Click_LogIn;
public  WebElement LogIn() {
	return Click_LogIn;}
	




}
