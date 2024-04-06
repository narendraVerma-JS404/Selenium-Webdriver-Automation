package testGridExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
	
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
        driver.manage().window().maximize();
		driver.navigate().to("https://www.railyatri.in/live-train-status");
		
		
		
		Thread.sleep(3500);
		
		//Verify Title
		//Actual result                Compare expected result
		if(driver.getTitle().equals("Where is my Train Irctc")){
			System.out.println("Title Matched");
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
				}
	driver.close();
	}


}
