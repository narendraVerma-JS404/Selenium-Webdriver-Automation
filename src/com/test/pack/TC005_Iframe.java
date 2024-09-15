package com.test.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005_Iframe {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login succesfull");
		
		// Iframe
		
		driver.switchTo().frame("rightMenu");
		System.out.println("Enter into frame");
		driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("NKV");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Verma");
		driver.findElement(By.xpath("//input[@type='button'][@value='Save']")).click();
		System.out.println("Save employee in database");
		driver.switchTo().defaultContent();
		System.out.println("Exit into frame");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Lpogout successfull");
		driver.quit();
		
	}

}
