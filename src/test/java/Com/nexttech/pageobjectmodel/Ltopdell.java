package Com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ltopdell {
 WebDriver driver;
 public Ltopdell (WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
@FindBy(xpath="//*[@id=\"category-bar\"]/div[1]/div/div[1]") 
 WebElement Click_dropdownnmenu_Laptops;
 public  WebElement dropdownmenu_Laptops () {
	return Click_dropdownnmenu_Laptops;
	 
 }

@FindBy(xpath="//a[@href='https://www.dell.com/en-us/shop/dell-laptops/sc/laptops?ref=hpg_cat_item1_home_cta']") 
 WebElement Click_For_Home;
public WebElement Click_For_Home () {
	return Click_For_Home;
	
}

}
