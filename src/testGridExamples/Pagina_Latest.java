package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pagina_Latest {
	
	public static void main(String[] args) throws Exception{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://letcode.in/advancedtable");
		System.out.println("Application Opened");
		Thread.sleep(3500);
		Select st = new Select(driver.findElement(By.xpath("//select[@name='advancedtable_length']")));
		st.selectByIndex(0);
		
		Thread.sleep(3500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		String Data = driver.findElement(By.xpath("//*[@id=\"advancedtable_length\"]")).getText();
		System.out.println(Data);//DropDown
		
		String TextData = driver.findElement(By.xpath("//div[@id='advancedtable_info']")).getText();
		System.out.println(TextData);//Text
		
		String totalPage = driver.findElement(By.xpath("//*[@id=\"advancedtable_paginate\"]/span")).getText();
		System.out.println("Total Page is : "+totalPage);//TotalPage
		
		int total_pages = Integer.parseInt(TextData.substring(TextData.indexOf("f")+2,TextData.indexOf("entries")-1)); // Corrected substring indices
	    System.out.println("Total Number of Pages: " + total_pages);//47 entries

	    
	    for(int p=1; p<=total_pages; p++)
	    {
	    	String ActivePage= driver.findElement(By.xpath("//a[@class='paginate_button current']")).getText();
    	    System.out.println("Current Active page = :"+ActivePage);
	    	if(p>1) {
	    		
	    	    System.out.println("<==============Next page will be open ==============>");
	    	    Thread.sleep(3500);
	    	   
	    	    
	        	    WebElement NextPageClick = driver.findElement(By.xpath("//a[@class='paginate_button next']"));
	        	    NextPageClick.click();
	        	    
	        	    
	        	    
	        	    int rows = driver.findElements(By.xpath("//table[@id='advancedtable']//tbody//tr")).size();//Rows No.
	 	        	System.out.println("Number of rows : "+rows);
	 	            Thread.sleep(3500);
	 	            
	 	            String row = driver.findElement(By.xpath("//table[@id='advancedtable']//tbody/tr/td[2]")).getText();//Rows No.
		        	System.out.println("data of rows : "+row);
		            Thread.sleep(3500);
		            
		            int cols = driver.findElements(By.xpath("//table[@id='advancedtable']//thead//tr//th")).size();
		            System.out.println("Number of cols : "+cols);
		            Thread.sleep(3500);
		            
		            int row_col = driver.findElements(By.xpath("//table[@id='advancedtable']//tbody//tr//td")).size();
		            System.out.println("Numbers of Row and Col : "+row_col);
	    	    }
	    	    
	    	    int numofRows = driver.findElements(By.xpath("//table[@id='advancedtable']//tbody//tr")).size();
				for(int r = 1; r<=numofRows; r++)
				{
					
					String S_NO=driver.findElement(By.xpath("//table[@id='advancedtable']//tbody//tr["+r+"]/td[1]")).getText();
					String universityName=driver.findElement(By.xpath("//table[@id='advancedtable']//tbody//tr["+r+"]/td[2]")).getText();
					String country=driver.findElement(By.xpath("//table[@id='advancedtable']//tbody//tr["+r+"]/td[3]")).getText();
					String website=driver.findElement(By.xpath("//table[@id='advancedtable']//tbody//tr["+r+"]/td[4]")).getText();
					
					
					System.out.println("====||"+S_NO+"===="+universityName+"====||"+country+"====||"+website+"====||");
					}
		
		
		
		
		

	}
	}

	}


