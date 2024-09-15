package com.test.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002_VerifyTitle 
     {
	public static void main(String[] args) throws Exception{
		//interface class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(4500);
		
		//Verify Title
	   // Actual Result compare expected result
		
		if (driver.getTitle().equals("OrangeHRM - New Level of HR Managemen"))
		{
			System.out.println("Title Matched");
		}
	   else {
				System.out.println("Title Not Matched");
				System.out.println(driver.getTitle());
			}
		   
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			
			//Verify Title
			if(driver.getTitle().equals("OrangeHRM")) 
			{  
			System.out.println("Title matched");    
			}
			
			else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
			}
		
		
		
		driver.close();
		driver.quit();
		
		
	}
     }


