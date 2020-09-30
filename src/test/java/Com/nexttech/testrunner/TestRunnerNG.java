package Com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerNG {

	// features folder and stepdef can communicate through TestRunner    
	 @CucumberOptions(  
			 features = {"Features"},     
	   glue = {"Com.nexttech.stepdefs"},    
	   tags= {"@offersH,@Fblogin,@Dldesktop,@laptop,@Hlocations"}
	 )  
	 public class Testrunner extends AbstractTestNGCucumberTests{}  

}
