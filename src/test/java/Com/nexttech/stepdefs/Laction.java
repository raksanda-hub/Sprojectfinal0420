package Com.nexttech.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Laction {
	WebDriver driver;
	@Test
	
	public void clickdropdown() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32 (3)//chromedriver.exe"); 
	    driver=new ChromeDriver();
	    driver.get("http://dell.com/en-us");
	    
	    Actions act=new Actions (driver);
	
	//act.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"category-bar\\\"]/div[1]/div/div[1]"))).build().perform();
	//driver.findElement(By.xpath("//a[@href='https://www.dell.com/en-us/shop/dell-laptops/sc/laptops?ref=hpg_cat_item1_home_cta']")).click();
	Thread.sleep(4000);
	
	
	
	}
	
	

}
