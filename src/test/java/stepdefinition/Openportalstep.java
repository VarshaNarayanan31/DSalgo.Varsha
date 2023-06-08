package stepdefinition;
import org.testng.Assert;

import driverfractory.Driversetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Openportal;
import utilities.LoggerLoad;


public class Openportalstep extends Base{
//Openportal portalpage;
	//portalpage= new Openportal(Driversetup.getDriver());
	//public Openportal(WebDriver driver) {
	//private static final String getstarted = null;
	//WebDriver driver;
	//	}
	//Openportal= new Openportal(driversetup.getDriver());
	
	//public static WebDriver driver = new ChromeDriver();
//WebDriver driver=Driversetup.getDriver();
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
    // driver.manage().window().maximize();

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		portalpage= new Openportal(Driversetup.getDriver());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://dsportalapp.herokuapp.com");
		//driver=driverfractory.Driversetup;
		//Openportal portalPage = new Openportal();
		 LoggerLoad.info("launch browser");
		
	}
	
	@Given("User opens dsalgo portal app url")
	public void user_opens_dsalgo_portal_app_url() {
		LoggerLoad.info("browser open");
		Driversetup.openPage("https://dsportalapp.herokuapp.com");
		//driver.get("https://dsportalapp.herokuapp.com");
		LoggerLoad.info("portal opened");
	}
	//Thread.sleep(1000);
	@When("User click on Get Started button")
	public void user_click_on_get_started_button() throws InterruptedException {
		portalpage.clickgetstarted();
		LoggerLoad.info("getstarted btn click");
		
	}
	//private static void clickgetstarted() {
		// TODO Auto-generated method stub
		
	//}
	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		String HomepgTitle = Driversetup.getdriverTitle();
		String ExpTitle = portalpage.gethomepagetitle();
	LoggerLoad.info(Driversetup.getdriverTitle());
		Assert.assertEquals(HomepgTitle,ExpTitle);
		LoggerLoad.info("User navigated to home page");
	}
	}
	
	
	
