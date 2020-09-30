package Com.nexttech.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {

	WebDriver driver;
	@Test
	
	public void clickdropdown() throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32 (3)//chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://mrbool.com/");
		 
		  Actions act=new Actions(driver); 
		  // creating object 
		 // act.moveToElement(driver.findElement(By.className("//a[@class=\"menulink\"]"))).build().perform();
		  // driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")) .click();
		  
		  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();
	        Thread.sleep(4000);
	}	
	}
