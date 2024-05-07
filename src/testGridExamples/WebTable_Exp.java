package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Exp {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/");
        
        //Count
         int row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
      	 int col = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th")).size();
      	
     	 
      	 int row_col = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td")).size();
      	 System.out.println("Row Count" + row);
      	 System.out.println("Col Count" + col);
      	 System.out.println("Row_col Count" + row_col);
      	 
    	 //Data Cell
       	 
       	 String celldata = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]")).getText();
    	 System.out.println(celldata);
    	 
    	 System.out.println("Row 2 : Data Showing ||Table data===> FlipKart");
    	 System.out.println("<=====================================>");
    	 
    	 // Data -- Table
    	 // DT Var VV
    	 for(int i= 1; i<=row; i++) {
    	 String data=driver.findElement(By.
    	        xpath("//*[@id='customers']/tbody/tr["+i+"]")).getText();
    	 System.out.println(data);
    	 System.out.println("<*********************************>");
    	 Thread.sleep(4000);
    	 
    	// driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[1]/input")).click();
    	 //Thread.sleep(4000);
    	 
    	 
    	 
    	 }
    	 driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[1]/input")).click();
    	 Thread.sleep(4000);
    	 System.out.println("Click on checkbox Successfully click");
    	 driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[1]/div/div/div/div[2]/table/tbody/tr[5]/td[5]/a")).click();
    	 
    	 driver.close();
      	 
	}

}
