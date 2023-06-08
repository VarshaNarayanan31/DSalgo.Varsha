package stepdefinition;
import org.openqa.selenium.WebDriver;

import pageObjects.Arrays;
import pageObjects.DStructure;
import pageObjects.Homepage;
import pageObjects.Linkedlist;
import pageObjects.Loginpg;
import pageObjects.Openportal;
import pageObjects.QueuePage;
import pageObjects.Register;
import pageObjects.StackPage;
import pageObjects.TreePage;
public class Base {
	
	public WebDriver driver;
	public Openportal portalpage;
	 public Register registerPage;
	 public Homepage homepage;
	 public Arrays arrays;
	 public Loginpg login;
	public QueuePage queuepage;
	public StackPage stackpage;
	 public Linkedlist linkedlist;
	public TreePage treepage;
	 public DStructure dspage;
	 
	// public void intializeDriver(){
		// System.setProperty("webdriver.chrome.driver","\".\\\\src/test/resources/drivers/chromedriver.exe");
		// driver=new ChromeDriver();
		 
	 }
	 

