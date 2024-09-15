package testGridExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReteriveData {
	
	public static void main(String args[]) throws Exception{
		//interface              class
		WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	
           	//Test Data   :  Hard Coded
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		
		 //MouseOver
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Admin"))).perform();
		Thread.sleep(3000);
		
		ac.moveToElement(driver.findElement(By.linkText("Company Info"))).perform();
		Thread.sleep(3000);
		
		ac.moveToElement(driver.findElement(By.linkText("General"))).perform();
		Thread.sleep(3000);
		
		ac.moveToElement(driver.findElement(By.linkText("Locations"))).perform();
		Thread.sleep(3000);
	    System.out.println("MouseOver completed");
	    
	    driver.findElement(By.linkText("Locations")).click();
	    
	  //INTER INTO FRAME
	    driver.switchTo().frame("rightMenu");
	    
	    driver.findElement(By.xpath("//input[@value='Add']")).click();  //Add button
	    driver.findElement(By.name("txtLocDescription")).sendKeys("Kolkata");
	    driver.findElement(By.xpath("//input[@id='editBtn']")).click();
	    
	    Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.accept();
	    Thread.sleep(4000);
	    
	  //EXIT FROM FRAME
	    driver.switchTo().defaultContent();
			
	    driver.findElement(By.linkText("Logout")).click();
	    System.out.println("Logout Completed");
	    System.out.println("Testing Excellent");
	    driver.close();

}
}
