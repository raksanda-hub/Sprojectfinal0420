package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Htoffers {

	WebDriver driver;
public Htoffers (WebDriver driver) {
	
	this.driver= driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@href='https://hiltonhonors3.hilton.com/en/offers/index.htm?cid=OH,WW,BespokeBookDirect,MULTIPR,Tile,Home,SingleLink,i80091']\r\n" + 
		"")
  WebElement  Click_Offers;
public WebElement Offers () {
	return Click_Offers;
	
}


}
