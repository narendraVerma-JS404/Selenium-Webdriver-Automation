package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_WebTable {
	
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
        driver.manage().window().maximize();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        
        //Count 
        int row = driver.findElements(By.xpath("//Table[@id='countries']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//Table[@id='countries']/tbody/tr[1]/td")).size();
   	    int row_col = driver.findElements(By.xpath("//Table[@id='countries']/tbody/tr/td")).size();
  	 
   	    System.out.println("Row Count" + row);
  	
   	    System.out.println("Col Count" + col);
  	
   	    System.out.println("Row_col Count" + row_col);
   	    
   	//Data Cell
      	 
     String celldata = driver.findElement(By.xpath("//Table[@id='countries']/tbody/tr[50]/td[3]")).getText();
   	 System.out.println(celldata);
   	 
   	 System.out.println("Row 2 : Data Showing ||Table data===> I think New Delhi");
   	 System.out.println("<=====================================>");
   	 
   	 // Data -- Table
	 // DT Var VV
	 for(int i= 1; i<=row; i++) {
	 String countries=driver.findElement(By.
	        xpath("//Table[@id='countries']/tbody/tr["+i+"]")).getText();
	 System.out.println(countries);
	 System.out.println("<*********************************>");
	 Thread.sleep(4000);
	}
driver.close();
}
}