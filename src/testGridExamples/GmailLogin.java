package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailLogin {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(4500);
		// Maximize the browser window
        driver.manage().window().maximize();
		Thread.sleep(4500);
        driver.navigate().to("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AaSxoQw7MrCHALmT_KA2BURdnAXmuAGFM97rJgXt2VOcSxPV5oNsEc6BgMZ9lvS7gTclGc6tbFze&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       
       driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vermanv44@gmail.com");
       driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
       driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("omnamahsivaya@nv");
       driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	}

}
