package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singlevd {

	WebDriver driver;
public Singlevd (WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy (xpath="//*[@id=\"headermenudesktop\"]/ul/li/a\r\n") 
  WebElement Click_dropdownmenu_content;
public WebElement dropdownmenu_content() {
	return Click_dropdownmenu_content;
	
}
@FindBy(xpath="//*[@id=\"headermenudesktop\"]/ul/li/ul/li[3]/a")
  WebElement Click_Single_Vedios;
public WebElement Single_Vedios() {
	return Click_Single_Vedios;
	
}


}
