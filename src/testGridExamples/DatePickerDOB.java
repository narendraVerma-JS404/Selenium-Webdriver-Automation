package testGridExamples;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDOB {
	
	//user defined method for converting month from string ------> month object
	
	static Month convertMonth(String month) {
		
		
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		
		monthMap.put("January",Month.JANUARY);
		monthMap.put("February",Month.FEBRUARY);
		monthMap.put("March",Month.MARCH);
		monthMap.put("April",Month.APRIL);
		monthMap.put("May",Month.MAY);
		monthMap.put("June",Month.JUNE);
		monthMap.put("July",Month.JULY);
		monthMap.put("August",Month.AUGUST);
		monthMap.put("September",Month.SEPTEMBER);
		monthMap.put("October",Month.OCTOBER);
		monthMap.put("November",Month.NOVEMBER);
		monthMap.put("December",Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
		
		if (vmonth == null) {
			System.out.println("Invalid month");
		}
		return vmonth;
		
	}
	
	static void selectDate(WebDriver driver, String reqYear,String reqMonth,String reqDate) throws Exception
	{
		//Select year
		
		        Thread.sleep(3500);
				WebElement yearDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select selectYear = new Select(yearDD);
				selectYear.selectByVisibleText(reqYear);
				
				//Select Month
				
				while(true)
				{       //Calendar previous year month
					
				String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				//  Convert reqMonth & displayMonth into month objects
				
				Month expectedMonth = convertMonth(reqMonth);
				Month currentMonth = convertMonth(displayMonth);
				
				//Compare
				
			    int result = expectedMonth.compareTo(currentMonth);
				
				//0 months are equal
				//>0 Future month
				//<0 Past Month
				
				if(result<0)
				{
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//past month
				}
				else if(result>0)
				{
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();//future month
				}
				
				else
				{
					break;
				}
					
			}
				//Date Selection
				  List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			       
				   for(WebElement dt : allDates)
				   {
					   if(dt.getText().equals(reqDate))
					   {
						   dt.click();
						   System.out.println("Our Found Date : "+reqYear+":"+reqMonth+":"+reqDate);
						   break;
					   }
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(02));
		driver.get("https://testautomationpractice.blogspot.com/");
		 
		//Scroll
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,390)", "");
		
		JavascriptExecutor jsn = (JavascriptExecutor) driver;
		jsn.executeScript("window.scrollBy(0,390)", "");
		
		JavascriptExecutor jsv = (JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,350)", "");
		// Data Write of DOB
		String reqYear = "2025";
		String reqMonth= "June";
		String reqDate = "1";
		
		driver.switchTo().frame("frame-one796456169");
		
		//Click on icon
		
		driver.findElement(By.xpath("/html/body/form/div[2]/div[6]/span")).click();
		System.out.println("Open Calendar succesfully");
		
		Thread.sleep(3500);
		
		selectDate(driver,reqYear,reqMonth,reqDate);
		
		
	}
}
