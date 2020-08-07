package crm_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm_Baseclass.Baseclass;

public class Login_CRM extends Baseclass{
/*Need to create Page factory - OR*/
	
	@FindBy(name="email")
	WebElement emailfield;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class= 'ui fluid large blue submit button']")
	WebElement Loginbtn;
	
	/*Created pagefactory initialized. Initializing Pageobject*/
	   public Login_CRM() {
		PageFactory.initElements(driver, this);
	    }
	
	
	  /**
	  *  Login - Enter the data in username and password click on login button
	  * @return 
	  * @throws Exception
	  */
	 public boolean loginpage (String username, String password) throws Exception {
	    if (!emailfield.isDisplayed()) {
	    	System.out.println("Emailfield is not displayed");
	    	return false;
	    }
	    emailfield.sendKeys(username);
	    Thread.sleep(2000);
	    if (!pwd.isEnabled()) {
	    	System.out.println("Password is not displayed");
	    	return false;
	    }
	  
	   pwd.sendKeys(password);
	   Thread.sleep(2000);
	   
	   Loginbtn.click();
	   Thread.sleep(2000);
	   return true;
	   
	 }


}
