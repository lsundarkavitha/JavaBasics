import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoImportBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// selenium code
	// create a driver object for the Chrome Browser
	// syntax classname.object=new classname();
	// ex. x.driver=new x();
	// chromedriver.driver=new chromebrowser(); --> driver oject for chromebrowser
	// we will strictly implement methods of web driver after the driver object is initiated
	// web driver is the interface , provide methods for automation
	// provide webdriver knowledge to the object so that it will automate all UI in the browser
		
    //WebDriver driver = new ChromeDriver();
    // invoke .exe file to invoke the browser	
    // path of the browser driver must be defined 
	//System.setProperty(key, value)	---> Syntax. In Java it expects double \\
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		    
		driver.get("http://google.com");
			
	}
}
