package testGridExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateFun 
  {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/calendar");
		
		    String expectedDay="2";
		    String expectedMonth= "July"; // Month should start with capital letter to match UI
		    String expectedYear="2024";
		    
		    Thread.sleep(3500);
		    
		    while (true) {
	             // when we stop while loop?
	             // when we find our expected month and year, then we stop it.
	             String calendarMonth = driver.findElement(By.xpath("/html/body/app-root/app-calender/section[1]/div/div/div[1]/div/div/div[1]/div[1]/nwb-date-picker/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]")).getText(); // Changed xpath to class name
	             System.out.println(calendarMonth);	      
	             
	             String calendarYear = driver.findElement(By.cssSelector("div[class='datetimepicker is-danger is-active'] div[class='datepicker-nav-year']")).getText(); // Changed xpath to class name
	             System.out.println(calendarYear);
	             
                System.out.println("While loop perform");
                
                Thread.sleep(4500);
	             if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)) { // Changed && to && and corrected semicolon position
	                 List<WebElement> daysList = driver.findElements(By.xpath("//div[@class='datetimepicker is-danger is-active']//button")); // 35 td tag
	                                                                                                 // Here we compare for my expectedDay=2
	                                                                                             // Hence we use for loop

	                 for (WebElement e : daysList) {
	                     String calendarDay = e.getText();
	                     System.out.println(calendarDay);
                      
	                
                      if (calendarDay.equals(expectedDay)) { // Here we are doing comparison between Actual Date and expected date
	                         e.click();
	                       Thread.sleep(3500); 
	                       System.out.println("Date : "+expectedDay+expectedMonth+expectedYear);
	                         break; // for loop break
	                         
	                     } // All those things are related to Equal Date, month, and year
	                       // if it is not Equal then what should I do?
	                       // Click on the next button so I can inspect the next button
	                 }
	                 break;

	             } 
	             else 
	             {
	                 driver.findElement(By.xpath("//*[@id=\"datetimePicker9da25718-0e1c-4745-b390-4d7145ab66c4\"]/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]")).click();
	                 
	                 
	             }
	      
	         }
	          driver.close();
	    }
		
		
  }

	


