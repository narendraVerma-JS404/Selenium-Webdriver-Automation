package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassVerifyTitle {
	
	public static void main(String args[]) throws Exception{
		   // Test Steps
		//interface class
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		System.out.println("Application Opened");
		//Verify Title
		// Actual Result compare expected result
		if(driver.getTitle().equals("ParaBank | Welcome | Online Bankin")) {//ParaBank | Welcome | Online Banking
		System.out.println("Title matched");    
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("username")).sendKeys("sysmgrnv");
		driver.findElement(By.name("password")).sendKeys("sysmgr01");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		//Verify Title
		if(driver.getTitle().equals("ParaBank | Accounts Over")) {  //ParaBank | Accounts Overview
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
