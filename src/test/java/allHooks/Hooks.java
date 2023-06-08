package allHooks;


	import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driverfractory.Driversetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.LoggerLoad;
	public class Hooks {
		@Before 
		
	    public static void setUp() {
			
			Driversetup.getDriver();
			Driversetup.setUpDriver();
	     
	     //Helper.setUpDriver();
	    }

	    @After
	    public static void tearDown(Scenario scenario) {
	 
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) Driversetup.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	         
	      //  Driversetup.tearDown();
	}
	}
		
	
	


