package testGridExamples;       //Package name should be anything
//Pre-def:
import org.openqa.selenium.WebDriver;           //To Access WebDriver Methods & Classes    
import org.openqa.selenium.chrome.ChromeDriver; //To Access Browser
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;                    //To Access Object Identification/Elements locator:Methods

public class TC001_Login_Logout {

	public static void main(String args[])throws Exception{       //Main method:To start program execution
		//Test Steps
		//interface           class:Pre-def
	//	WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");    //navigate:For the link
		Thread.sleep(3000);   //wait statement
		driver.close();       //close 
	}

}
