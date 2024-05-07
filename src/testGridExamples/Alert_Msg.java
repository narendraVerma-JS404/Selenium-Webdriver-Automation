package testGridExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Msg {
	
	public static void main(String[] args) throws Exception{
		
		          //Test Steps
		
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
        driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		         
		         //Alert method using
		
		Demo.repository
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Narendra");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.close();
		
	}

}
