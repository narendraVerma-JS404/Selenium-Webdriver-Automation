package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Demo {
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        //Down page
       // driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
        //Thread.sleep(4000);
        //driver.findElement(By.name("/html")).sendKeys(Keys.ARROW_DOWN);
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1200)");
        
        //Count
     int row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
   	 int col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
   	 int row_col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td")).size();
   	 System.out.println("Row Count" + row);
   	 System.out.println("Col Count" + col);
   	 System.out.println("Row_col Count" + row_col);
   	 
   	 //Data Cell
   	 
   	 String celldata = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[3]")).getText();
	 System.out.println(celldata);
	 
	 System.out.println("Row 2 : Data Showing ||Table data===> Amit");
	 System.out.println("<=====================================>");
	 
	 // Data -- Table
	 // DT Var VV
	 for(int i= 1; i<=row; i++) {
	 String data=driver.findElement(By.
	        xpath("//table[@name='BookTable']/tbody/tr["+i+"]")).getText();
	 System.out.println(data);
	 System.out.println("<*********************************>");
	 Thread.sleep(4000);
	 }
	 
	 driver.close();
	 }
	}


