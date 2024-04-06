package testGridExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(3500);
		
        driver.navigate().to("https://automationintesting.online/");
		driver.findElement(By.xpath("//button[@id='submitContact']")).click();
		
		Thread.sleep(5000);
		String str= driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')]")).getText();
    	System.out.println(str);
    	driver.findElement(By.xpath("//button[@id='submitContact']")).click();
    	String st= driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')]")).getText();
    	System.out.println(st);
    	
		//Alert at = driver.switchTo().alert();
		//System.out.println(at.getText());
    	
    	
    	driver.quit();		
	}

}
