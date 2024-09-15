package testGridExamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePIcker {
	
	public static void main(String[] args) throws Exception{
      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		   // Switch to frame by index
	    driver.switchTo().frame(0);
	    
	    String month = "May";
	    String year  = "2024";
	    String day   = "29";
	    
	    // click and open calendar action
	    WebElement datepicker = driver.findElement(By.id("datepicker"));
	    datepicker.click();
	    
	    // Select month and year
	    while(true)
	    {
	    String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    
	    if (currentMonth.equals(month) && currentYear.equals(year))
	    {
	    	break;
	    }
	    //Next Button
	    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
	    
	    //Select Date
	    
	   List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
       
	   for(WebElement dt : allDates)
	   {
		   if(dt.getText().equals(day))
		   {
			   dt.click();
			   System.out.println("Our Found Date : "+day+month+year);
			   break;
		   }
		
		   
	   }
}
}



