package testGridExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Msg_Alert {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
        driver.manage().window().maximize();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        
        Thread.sleep(4000);
        //Verify Alert
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nverma");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kuch");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        //Alert at = driver.switchTo().alert();
       //System.out.println(at.getText());
        //at.accept();
        
        String str= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p")).getText();
    	System.out.println(str);
        driver.quit();
		
	}

}
