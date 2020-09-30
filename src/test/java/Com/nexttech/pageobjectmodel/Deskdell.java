package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deskdell {
WebDriver driver;
public Deskdell (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//*[@id=\"l1\"]")
WebElement Click_dropdownmenu_products;
public WebElement dropdownmenu_products() {
	return Click_dropdownmenu_products;
	
}
@FindBy(xpath="//*[@id=\"l1_2\"]/span")
WebElement Click_dropdownmenu_Desktops;
public WebElement dropdownmenu_Desktops() {
	return Click_dropdownmenu_Desktops;
	
}
@FindBy(xpath="//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[2]/ul/li[2]/a/img")
WebElement Click_For_Business;
public WebElement Click_For_Business() {
	return Click_For_Business;
	
}



}
