package pageObjects;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Base;

public class Openportal extends Base{
	
	
	
//public static WebDriver driver= n
public Openportal (WebDriver driver)
{
 PageFactory.initElements(driver, this);
}
	  
	 @ FindBy(xpath="//button[text()='Get Started']")WebElement getstarted;
	
	  
	  
	   public void clickgetstarted (){
	 getstarted.click();
	 
	   }
	 public   String gethomepagetitle() {
			return "NumpyNinja";
	   
	  }
	  
	   
	  
	  }
	  
	  
	
	



