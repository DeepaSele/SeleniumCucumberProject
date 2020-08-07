package crm_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import crm_Baseclass.Baseclass;

public class Homepageverify_CRM extends Baseclass{
	@FindBy(xpath="//span[text()='Tester01 Last']")
	WebElement Homepage;

//	-----------------------------------------------------
	@FindBy(xpath="//span[text()='Contacts']/ancestor:: a[@class='item']")
	WebElement contacttab;
	
	@FindBy(xpath="//div[@class='ui loader' or text()='Contacts']")
	WebElement Contactpagetext; 
	
	
	public String homepagescreen(String Expval) { //Expval:Tester01 Last
		String actvalue= Homepage.getText();
		System.out.println(actvalue);
		if (actvalue.equalsIgnoreCase(Expval)) {
			System.out.println("Validation homepage is passed");
		}else {
			System.out.println("Validation of homepage is failed");
			
		}
	    return actvalue;
	}
	
public boolean contatctab() throws Exception {
		
		if (!contacttab.isDisplayed()) 
		   {
			System.out.println("Contatct tab is not displayed");
			return false;
		    } 
		contacttab.click();
		Thread.sleep(2000);
		if (!Contactpagetext.isDisplayed()) {
			System.out.println("Contact homepage is not displayed");
			return false;
			}
		return true;	
		}
}
