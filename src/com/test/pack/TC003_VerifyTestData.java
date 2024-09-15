package com.test.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003_VerifyTestData {
	
	static String url    = "http://183.82.103.245/nareshit/login.php";
	static String un     = "nareshit";
	static String pd     = "nareshit";
	static String title1 = "OrangeHRM - New Level of HR Managemen..";//wrong title
	static String title2 = "OrangeHRM";
	
	    public static void main(String[] args) throws Exception {
			
	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	
	    	driver.get(url);
	    	/*if(driver.getTitle().equals(title1)) {
	    		System.out.println("Title Matched");
	    	}
	    	else {
	    		System.out.println("Title not Matched");
	    		System.out.println(driver.getTitle());
	    	}
	    	
	    	driver.findElement(By.name("txtUserName")).sendKeys(un);
	    	driver.findElement(By.name("txtPassword")).sendKeys(pd);
	    	driver.findElement(By.name("Submit")).click(); */
	    	
	    	//Test Data : hard coded
	     	if(driver.getTitle().equals(title1))
	     	{
	     		System.out.println("Title matched");	
	     	}
	     	else 
	     	{
	     		System.out.println("Title not matched");
	     		System.out.println(driver.getTitle());
	     	}
	     	Thread.sleep(2000);
	    	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	     	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	     	driver.findElement(By.name("Submit")).click();
	     	
	     	System.out.println("Login completed");
	     	
	     	// Verify Title
	     	
	     	if(driver.getTitle().equals(title2))
	     	{
	     		System.out.println("Title matched");	
	     	}
	     	else 
	     	{
	     		System.out.println("Title not matched");
	     		System.out.println(driver.getTitle());
	     	}
	     	
	     	driver.findElement(By.linkText("Logout")).click();
	     	System.out.println("Logout completed");
	     	System.out.println("Testing excellent");
	     	
	    	
	    	driver.close();
	    	driver.quit();
		}
	
	

}
