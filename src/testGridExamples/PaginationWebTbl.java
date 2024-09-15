package testGridExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class PaginationWebTbl {
	
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		// Login
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("https://demo.opencart.com/admin/")).click();
		
		
		Screen sc = new Screen();
		Thread.sleep(2000);
		sc.click("D:\\Opencart.PNG");

		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//Table
		//(2) Find the total no of pages in this table
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);//Showing 1 to 10 of 404 (41 Pages)
		
		//Scroll
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
	     
		//WebElement activepages=driver.findElement(By.xpath("//*[@id=\"form-order\"]/div[1]/table/tbody"));
		//System.out.println(activepages.getText());
		
				//Starting index()         End Index()
		int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1)); // Corrected substring indices
        System.out.println("Total Number of Pages: " + total_pages);//41 pages
        
        Thread.sleep(3500);
       
       // (3) Find how many rows exists in each pages
        for(int p=1; p<=5; p++)
        {                                             //Everytime it will be pointing the active page.
        	WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span")); //span[normalize-space()='1'] This xpath match all kind of Active page
        	System.out.println("Active page: "+activePage.getText());//1
        	
        	
        	int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();//Rows No.
        	System.out.println("Number of rows : "+rows);
            Thread.sleep(3500);
		
				Thread.sleep(3000);
			System.out.println("<=================================================>");
			
			{
          
      	//(4)next page
        	
        	Thread.sleep(3500);
        	driver.findElement(By.xpath("//*[@id=\"form-order\"]/div[2]/div[1]/ul/li[12]/a"));
        	activePage.click();
        	
        	
        	
        	}
        	}  
	}
}
	
	



        
        
	





        
        



//Dynamic web table means the data will not fix that means the rows and columns are not fixed, 
//based on the data the rows and columns increase and decrease