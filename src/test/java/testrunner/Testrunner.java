package testrunner;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features"},glue ={"stepdefinition","allHooks"},
                 monochrome=true,
                		 dryRun=false,
plugin= {"pretty","html:target/cucumber.html" ,
		//"json:target/Ds-algo.json",
		//"rerun:target/rerun.txt"  ,//mandatory for capture failures 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		}
,tags="@1 or @2 or @3 or @4 or @5 or @6 or @7 or @8 or @9")
        

 
 


public class Testrunner {
}
