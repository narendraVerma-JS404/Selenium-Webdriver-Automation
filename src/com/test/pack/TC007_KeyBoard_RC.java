package com.test.pack;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC007_KeyBoard_RC {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(45000);
		//driver.findElement(By.name("Submit")).click();
		
		//KeyBoard click TAB : ENTER
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_TAB);
		rc.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		System.out.println("TAB Botton press and release");
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		System.out.println("Login completed through the keyboard action");
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();	
		

		
	}

}
