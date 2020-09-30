package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationsHt {
 WebDriver driver;
 public LocationsHt (WebDriver driver) {
	 
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 
@FindBy(xpath="//a[@href='https://www.hilton.com/en/locations/?cid=OH,WW,BespokeBookDirect,MULTIPR,Tile,Home,SingleLink,i80090']\r\n" + 
		"") 
WebElement Click_Locations;
public WebElement Locations() {
	return Click_Locations;
	
}
 
 
 
}
