package testGridExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC_TestData {
	//Test Data
	//DT           Variable      VV
	static String  url     ="http://183.82.103.245/nareshit/login.php";
	static String username ="nareshit";
	static String password ="nareshit";
	static String title1   ="OrangeHRM - New Level of HR Management";
	static String title2   ="OrangeHRM";
	
public static void main(String args[]) throws Exception{
    //Test Steps
    //interface              class
    WebDriver    driver =new ChromeDriver();
    driver.navigate().to(url);
    Thread.sleep(3500);
    System.out.println("Application Opened");
    //Verify Title
    //Actual Result          Compare expected Result
    if(driver.getTitle().equals(title1)) {    //when i given =if(driver.getTitle().equals(title2)) {
    System.out.println("Title Matched");
    }
    else {
    System.out.println("Title not Matched");
    System.out.println(driver.getTitle());   //Then it will show="OrangeHRM - New Level of HR Management"
    }
    //Test Data : Hard Coded
    //driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    //driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
   //Test Data :pass from variable 
    driver.findElement(By.name("txtUserName")).sendKeys(username);
    driver.findElement(By.name("txtPassword")).sendKeys(password);
    
    Thread.sleep(3000);
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(3000);
    System.out.println("Login Completed");
    //Verify Title
    // Actual Result     Compare expected result
    if(driver.getTitle().equals(title2)) {
    System.out.println("Title Matched");
    
    }
    else {
    System.out.println("Title not matched");
    System.out.println(driver.getTitle());
    
    }
    driver.findElement(By.linkText("Logout")).click();
    System.out.println("Logout completed");
    System.out.println("Testing Excellent");
    driver.close();
    }
}

    
    
    	
    
