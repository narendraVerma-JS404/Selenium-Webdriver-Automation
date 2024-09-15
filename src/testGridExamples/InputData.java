package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputData 
        {
	
	    public static void main(String[] args) throws Exception
	    {
		  WebDriver driver = new ChromeDriver();
			
			// Maximize the browser window
	        driver.manage().window().maximize();
			Thread.sleep(4500);
			
			driver.navigate().to("https://letcode.in/test");
			Thread.sleep(2500);
			
			driver.findElement(By.linkText("Edit")).click();
			
			String data = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[1]/label")).getText();
			System.out.println(data);
			
			driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Narendra Verma");
			Thread.sleep(1000);
			
			String Data = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[2]/label")).getText();
			System.out.println(Data);
			
			driver.findElement(By.xpath("//input[@id='join']")).sendKeys("I am good");
			Thread.sleep(1200);
			
			String Text = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[3]/label")).getText();
			System.out.println(Text);
			
			driver.findElement(By.xpath("//input[@id='getMe']")).clear();
			driver.findElement(By.xpath("//input[@id='getMe']")).sendKeys("Ok !!! not a problem , I love Testing ");
			
			
	        String clear = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[4]/label")).getText();
	        System.out.println(clear);
	        
	        driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
	        
	        String bt = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[5]/label")).getText();
	        System.out.println(bt);
	       // driver.findElement(By.xpath("//input[@id='noEdit']")).sendKeys("NV");
			Thread.sleep(4000);
			
			 String bts = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[6]/label")).getText();
		     System.out.println(bts);
		     
		     String readonly = driver.findElement(By.xpath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[6]/label")).getText();
		     System.out.println(readonly);
		     
		     String textbox = driver.findElement(By.xpath("//*[@id=\"dontwrite\"]")).getText();
		     System.out.println(textbox);
		
			
		     
			
		  
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		 
	}

}
