package testGridExamples;
//To access WebDriver methods & classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;    //To Access Browser
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;     //TO access object/elements methods
public class TC_MouseOver {
	//--Test Data
	     //DT     VAR        VV
	static String url ="http://183.82.103.245/nareshit/login.php";
	static String username ="nareshit";
	static String password ="nareshit";
	static String title1 ="OrangeHRM-New Level of HR Management";
	static String title2 ="OrangeHRM";
	
	public static void main(String args[]) throws Exception{
		//Test Steps
//Interface                   class
	WebDriver   driver = new ChromeDriver();
	driver.navigate().to(url);
	Thread.sleep(2000);
	System.out.println("Application Opened");
	//Verify title
	//Actual Results       compare expected result
	if(driver.getTitle().equals(title1)) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	//Test Data   :  Hard Coded
	//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//Test data pass from variable
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login completed");
	//Verify Title
	if(driver.getTitle().equals(title2)) {
		System.out.println("Title matched");
	}
	else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
	}
	 //MouseOver
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(3000);
    System.out.println("MouseOver completed");
    //click on Sub menu
    driver.findElement(By.linkText("Logout")).click();
    Thread.sleep(4000);
    System.out.println("Logout completed");
    System.out.println("Testing Excellent");
    driver.close();
    }
}

