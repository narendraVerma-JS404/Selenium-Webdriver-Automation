package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Pick {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(5000);
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		//---click on Add btn
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Sohit");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Sharma");
		Thread.sleep(4000);
		
		driver.findElement(By.id("btnEdit")).click();   //Save button
		Thread.sleep(4000);
		System.out.println("New emp added");
		
		driver.findElement(By.xpath("//*[@id=\"btnEditPers\"]")).click();
		driver.findElement(By.name("btnDOB")).click();
		driver.findElement(By.xpath("//*[@id=\"cal1_cell20\"]/a")).click();
		//driver.findElement(By.name("DOB")).sendKeys("2024-03-17");
		
		Select st = new Select(driver.findElement(By.name("cmbMarital")));
		st.selectByVisibleText("Unmarried");
		//st.selectByIndex(1);
		//st.selectByValue("0");
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"btnEditPers\"]")).click();
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout completed");
		System.out.println("Testing Excellent");
		driver.close();
		}
		
		
	}


