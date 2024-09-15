package testGridExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;


public class PaginationWebTb {
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		// Login
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);		
		 if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
	       {
	       driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	       }                
		
		Thread.sleep(3500);
//		Screen sc = new Screen();
//		Thread.sleep(2000);
//		sc.click("D:\\Opencart.PNG");
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);//Showing 1 to 10 of 404 (41 Pages)
		
	//Scroll
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		//Starting index()         End Index()
		int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1)); // Corrected substring indices
        System.out.println("Total Number of Pages: " + total_pages);//43 pages
		
		 // Retrieve data from all pages
        
        for(int p=1; p<=5; p++)
        {
        	if(p>1)
        		Thread.sleep(3500);
        	    System.out.println("<==============Next page will be open ==============>");
        	    Thread.sleep(3500);
        	    { 
        	    WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
        	    	activePage.click();
        	   // WebElement nextPageClick = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/form/div[2]/div[1]/ul/li[10]/a"));
 			   // nextPageClick.click();
 				int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();//Rows No.
 	        	System.out.println("Number of rows : "+rows);
 	            Thread.sleep(3500);
 	            
 	            String row = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr/td[2]")).getText();//Rows No.
	        	System.out.println("data of rows : "+row);
	            Thread.sleep(3500);
 	            
 	            int cols = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//thead//tr//td")).size();
 	            System.out.println("Number of cols : "+cols);
 	            Thread.sleep(3500);
 	            
 	            int row_col = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr//td")).size();
 	            System.out.println("Numbers of Row and Col : "+row_col);
 	            
 					}
        	    
        		int numofRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
				for(int r = 1; r<=numofRows; r++)
				{
//		        String Header = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//thead//tr//td")).getText();
//		        System.out.println(Header);//Retrive nahi hua 
					

				String Order_Id=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String store=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[4]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				String total=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[6]")).getText();
				String Date_added=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[7]")).getText();
				String Date_Modified=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[8]")).getText();
				System.out.println("====||"+Order_Id+"===="+store+"====||"+customer+"====||"+status+"====||"+total+"====||"+Date_added+"====||"+Date_Modified);
				}
				
				System.out.println("Thanks Testing done!!!!!!!!!!!!!!!!");
        }
	   
        }
	}


	 
	



