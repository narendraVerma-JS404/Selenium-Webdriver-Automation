package testGridExamples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_ScreenShot {
	
public static void main(String[] args) throws Exception{
	
	           //Test steps
	WebDriver driver = new ChromeDriver();
	
	try {
		
	
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(35600);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(38600);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Bhai Application open ho gya!!!!!!!!!!!");
	
	         //MOUSE OVER
	
	Actions mo = new Actions(driver);
	mo.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("Mouse Over ka kam Khatam");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Add Employee")).click();  //Give Wrong Name :Like ==>Add Employee 01
	System.out.println("Clicked on Add employeee sub menu");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4500);
	System.out.println("Logout complete ho gya ====Bro Happy");
	
		
	}
	catch(Exception e) {
	  
	   File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(f1, new File("E:\\TestREsults.png"));
	}
	driver.close();
}
}

