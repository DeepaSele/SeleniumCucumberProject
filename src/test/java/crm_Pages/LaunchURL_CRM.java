package crm_Pages;

import crm_Baseclass.Baseclass;

public class LaunchURL_CRM extends Baseclass {

	
	//Each page has lot of elements you created xpath and stored in this page called Pageobject/ object repository
	
    /*No Need to create constructor. Not using any driver in this class*/
	 
	
       
    public boolean verifyURL(String expurl) {
	    System.out.println("Comment added in GITHUB")
       
       String actualUrl= driver.getCurrentUrl();
       if (actualUrl.equalsIgnoreCase(expurl)) {
       
    	   System.out.println("URL Verification successfull");
    }else {
    	  System.out.println("URL is failed Actual is:"+actualUrl +"Expected:"+expurl);
    	  return false;    
           }
      return true;
    }
	
    
   /*Verify the Title of the Page */
    public String title() {
    	String title = driver.getTitle();
    	 return title;
        }
    


}
