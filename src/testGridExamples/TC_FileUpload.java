package testGridExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class TC_FileUpload {
public static void main(String args[]) throws Exception{
        
	//TEST STEPS
	
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login Completed");
Thread.sleep(3500);

  //CLICK ON : Add Button

driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(4000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("VISHAL");
driver.findElement(By.name("txtEmpLastName")).sendKeys("VERMA");

  //FILE UPLOAD

WebElement fileInput = driver.findElement(By.name("photofile"));
fileInput.sendKeys("C:\\Users\\Dharmendra Verma\\Downloads\\wp2952351-lord-shiv-3d-wallpaper.jpg");
Thread.sleep(5000);
System.out.println("File Uploaded Successfully");

driver.findElement(By.id("btnEdit")).click();
Thread.sleep(5000);
System.out.println("New EMP Added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("login completed");
driver.close();

}

}
