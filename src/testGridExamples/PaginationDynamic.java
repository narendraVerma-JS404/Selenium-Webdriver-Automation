package testGridExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class PaginationDynamic {

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
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		System.out.println("Login successfully in opencart");;
		
		/*Screen sc = new Screen();
		Thread.sleep(2000);
		sc.click("D:\\Opencart.PNG");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		username.clear();
		username.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		       if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		       {
		       driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		       }                                                        
		                                                               */
		
		driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a")).click();
		
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		System.out.println(text);
    int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
         System.out.println(total_pages);
  //Scroll
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)", "");
	
	Thread.sleep(4500);			//Repeating pages
				for(int p=1; p<=5; p++)
				{
					if(p>1)
						Thread.sleep(3000);
					System.out.println("<=================================================>");
					{
		          
	WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
			   activePage.click();
				int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();//Rows No.
	        	System.out.println("Number of rows : "+rows);
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
		            
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				String customerGroup=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[4]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				
				System.out.println(customerName+"||"+email+"||"+customerGroup+"||"+status);
				}
	}
		
				
		
		
		
		
		
		
		
		
		
		
		
	}	
}
	

