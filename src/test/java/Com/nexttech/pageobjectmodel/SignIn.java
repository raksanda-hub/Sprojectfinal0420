package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	WebDriver driver;
	
public SignIn (WebDriver driver)	{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
/*constructor is not a method but special type of method
 * 1constructor name and class name will be same
 * 2.there is no return type	
 */
	
   @FindBy(xpath="//*[@id=\"tdb3\"]/span[2]")
     WebElement click_MyAccount;
   
   public WebElement MyAccount()   {
	return click_MyAccount;
	}



 @FindBy (name="email_address")
WebElement Type_EmailAddress;
 public  WebElement EmailAddress() {
	return Type_EmailAddress;
	}
 
 @ FindBy(name="password")
 WebElement type_password;
 public  WebElement password() {
	return type_password;
	}
 
 @ FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
 WebElement Click_Signin;
 public  WebElement Signin() {
	return Click_Signin;}
 
 @FindBy(xpath="//*[@id=\"bodyContent\"]/h1")
 WebElement Txt_myaccountinfo;
 public WebElement myaccountinfo() {
	return Txt_myaccountinfo;
}
 
 @FindBy(xpath="//div[@class='container_24']")
 WebElement click_Logoff;
 public WebElement Logoff() {
	return click_Logoff;
	 
 }
 
	

	 
 
 
 
}
 
 
