package crm_Baseclass;

 
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

 

	public class Baseclass {

	public static WebDriver driver;
	public static String browser;

    
	public void launchtheBrowser(String browser, String url) {
			
	//I didn't create any properities. Call this method in Testcases package	
		     
		
			System.setProperty("webdriver.chrome.driver","C:\\Deepa\\Eclipse Workspace\\Selenium_Java_BySrinivas\\Drivers\\ChromeDriver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "C:\\Deepa\\Eclipse Workspace\\Selenium_Java_BySrinivas\\Drivers\\FirefoxDriver\\geckodriver.exe");
			if(browser.equalsIgnoreCase("chrome")) {
				driver =new ChromeDriver();
			}else {
				driver = new FirefoxDriver();
		          }
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout( 30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
		 
			 }
   
	 public void quitbrowser() {
		 driver.quit();
	 }


}
