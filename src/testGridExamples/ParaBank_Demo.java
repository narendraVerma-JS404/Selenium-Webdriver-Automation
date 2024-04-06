package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParaBank_Demo {
	
	public static void main(String[] args) throws Exception{
		 WebDriver driver = new ChromeDriver();
		 
		// Maximize the browser window
	        driver.manage().window().maximize();
		 
		 //Provide URL
		 driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		 
		 //Provide Login Credentials
		 driver.findElement(By.name("username")).sendKeys("system");
		 driver.findElement(By.name("password")).sendKeys("tiger");
		 driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		 Thread.sleep(3500);
		 System.out.println("Login completed succesfully");
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[4]/a")).click();
		 driver.findElement(By.xpath("//input[@value='Send Payment']")).click();
		 System.out.println("Error messages should be displayed");
		 
		 //getText message retrive
		 
		 String Str = driver.findElement(By.xpath("/html/body")).getText();
		 System.out.println(Str);
		 driver.close();
		 
	}

}
