package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankPara_TextRet {
	
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
		 
		 //getText message retrieve
		 
		 String Str = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[3]/span")).getText();
		 System.out.println(Str);
		 
		 String St = driver.findElement(By.xpath("//span[normalize-space()='Address is required.']")).getText();
		 System.out.println(St);
		 
		 String Sr = driver.findElement(By.xpath("//span[normalize-space()='City is required.']")).getText();
		 System.out.println(Sr);
		 
		 String Sng = driver.findElement(By.xpath("//span[normalize-space()='State is required.']")).getText();
		 System.out.println(Sng);
		 
		 String Sg = driver.findElement(By.xpath("//span[normalize-space()='Zip Code is required.']")).getText();
		 System.out.println(Sg);
		 
		 String Sn = driver.findElement(By.xpath("//span[normalize-space()='Phone number is required.']")).getText();
		 System.out.println(Sn);
		 
		 String Srn = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.account == 'empty'\"]")).getText();
		 System.out.println(Srn);
		 
		 String Svn = driver.findElement(By.xpath("//span[@ng-show=\"validationModel.verifyAccount == 'empty'\"]")).getText();
		 System.out.println(Svn);
		 
		 String Stn = driver.findElement(By.xpath("//span[normalize-space()='The amount cannot be empty.']")).getText();
		 System.out.println(Stn);
		 
		 Thread.sleep(3500);
		 driver.close();
		 
		 
	}

}
