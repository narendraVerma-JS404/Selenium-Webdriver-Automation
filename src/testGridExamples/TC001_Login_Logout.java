package testGridExamples;       //Package name should be anything
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//Pre-def:
import org.openqa.selenium.WebDriver;           //To Access WebDriver Methods & Classes    
import org.openqa.selenium.chrome.ChromeDriver; //To Access Browser

public class TC001_Login_Logout {

	public static void main(String args[])throws Exception{       //Main method:To start program execution
		//Test Steps
		//interface           class:Pre-def
	//	WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");    //navigate:For the link
		Thread.sleep(3000);   //wait statement
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		Thread.sleep(4000);
		
		driver.close();       //close 
	}

}
