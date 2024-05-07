package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData_Parabank {
	
	 static String url="https://parabank.parasoft.com/parabank/index.htm";
	 static String username= "sysmgrnv";
	 static String password= "sysmgr01";
	 static String title1 = "ParaBank | Welcome | Online Bankin";
	 static String title2 = "ParaBank | Accounts Overvie";
	
	public static void main(String[] args) throws Exception{
		
		  // Test Steps
		//interface class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(url);
		Thread.sleep(3000);
		System.out.println("Application Opened");
		//Verify Title
		// Actual Result compare expected result
		if(driver.getTitle().equals(title1)) {
		System.out.println("Title matched");    
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		// Test Data : Hard Coded
		//driver.findElement(By.name("username")).sendKeys("sysmgrnv");
		//driver.findElement(By.name("password")).sendKeys("sysmgr01");
		//Test Data : pass from Variable
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		//Verify Title
		if(driver.getTitle().equals(title2)) {
		System.out.println("Title matched");    
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		System.out.println("Logout completed");
		System.out.println("Testing Excellent");
		driver.close();
		
		 
	}

}
