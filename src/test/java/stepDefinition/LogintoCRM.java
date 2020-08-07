package stepDefinition;

 
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
 
 
import crm_Baseclass.Baseclass;
import crm_Pages.Homepageverify_CRM;
import crm_Pages.LaunchURL_CRM;
import crm_Pages.Login_CRM;
 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogintoCRM  extends Baseclass{
Baseclass obj;
LaunchURL_CRM obj1;
Login_CRM obj2;
Homepageverify_CRM obj3;
	
	 


@Given ("^Launch the browser$")
public void launchbrowser() {
	System.out.println("First comment after commit in server");
	obj = new  Baseclass();
	obj.launchtheBrowser("Chrome", "https://ui.cogmento.com/");


	
//	/**
//    Create page elemnt here
//	*/
		obj1 =PageFactory.initElements(driver,  LaunchURL_CRM.class);
		obj2 =PageFactory.initElements(driver,  Login_CRM.class);
		obj3 =PageFactory.initElements(driver,  Homepageverify_CRM.class);
	}
	
	
@When("^Open the application with url$")
	 public void launchURL() {
	 boolean acturl = obj1.verifyURL("https://ui.cogmento.com/");
	 Assert.assertTrue(acturl ,  "Url is not expeted");
		
	}
	 
//I given data to below method on page class
@Then("^Login with Single User$") 
	public void signin() throws Exception{
	boolean Signin = obj2.loginpage("dsdeepaganesh@gmail.com","Testing01");
	Assert.assertTrue(Signin, "Signin Failed");
		
	}
@Then("^user enters with multiple User \"(.*)\" and \"(.*)\"$") 
	public void userenter_withdiffcred(String username, String password) throws Exception{
	boolean Signin = obj2.loginpage(username, password);
	Assert.assertTrue(Signin, "Signin Failed");
		
	}
//Below method will use for DataTable using List Object
//@Then("^user enters username and password$")
//    public void userenter_nameandpassword(DataTable credentials) {
//	List<List<String>> data = credentials.raw();
//	driver.findelement(By.className(username)).sendkeys(data.get(0).get(0));
//	driver.findelement(By.className(password)).sendkeys(data.get(0).get(1));
//}
	
@Then("^CRM homepage displayed for single user$") 
    public void homeheadervalidation() {
	String actul=	obj3.homepagescreen("Tester01 Last");
	Assert.assertEquals( actul,"Tester01 Last");
	}
	
@Then("^click on Contact tab$")
	public void contatctab() throws Exception {
	boolean actual = obj3.contatctab();
	Assert.assertTrue(actual,"Not reach to Contact homepage");
		
	}
   
@And("^Quit the browser$")
   public void teardown() {
	   	obj.quitbrowser();
   }

/*  Hardcoded the data in the method. Now we are going to replace (User enter the \"(.*)\" and \"(.*)\")
 *  Change the method into -->public void usrname_password(String username, string Password) throws Exception
 *  See the CRMapplicationfeature file has the parameter for(WITHOUT EXAMPLES)
// */
//  @When ("User enter the username and Password") 
//	public void usrname_password() throws Exception{
//  driver.findelement(By.name("username")).sendkeys("dsdeepaganesh@gmail.com");
//  driver.findelement(By.name("password")).sendkeys("Testing01") 
//   
   
   
}
