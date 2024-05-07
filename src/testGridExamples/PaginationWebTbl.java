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
		
	                                                     //Starting index()         End Index()
		int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1)); // Corrected substring indices
        System.out.println("Total Number of Pages: " + total_pages);//41 pages
       
        //(3) Find how many rows exists in each pages
        for(int p=1; p<=5; p++)
        {
        	WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));//span[normalize-space()='1']  Active page
        	System.out.println("Active page: "+activePage.getText());
        	activePage.click();
        	
        	int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
        	System.out.println("Number of rows : "+rows);
        	
        	// (4) Read all the rows from each page
     
        	for(int r=1;r<=rows; r++)
        	{
        	String orderId =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
        	String customerName =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
        	String status =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
        	
        	if(status.equals("Pending"))
        	{
        	System.out.println(orderId+"         "+customerName+"         "+status);
        	}
        	
        	
        	 // Go to next page
            if (p < total_pages) {
                String nextPage = String.valueOf(p + 1);
                driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='" + nextPage + "']")).click();
        	
        	
        	//(4)next page
        	String pageno = Integer.toString(p+1);
        	driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
        	//driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='2']")).click();
        	}
        	}
        }
	}
}
        
        
	





        
        



//Dynamic web table means the data will not fix that means the rows and columns are not fixed, 
//based on the data the rows and columns increase and decrease