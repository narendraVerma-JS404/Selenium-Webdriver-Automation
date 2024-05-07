package testGridExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassGetTitle {
	
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
        driver.manage().window().maximize();
		driver.navigate().to("https://mdbootstrap.com/docs/standard/data/datatables/");
		
		
		Thread.sleep(3500);
		
		//Verify Title
		//Actual result                Compare expected result
		if(driver.getTitle().equals("Web page Access")){  //Bootstrap Datatables - examples & tutorial
			System.out.println("Title Matched");
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
				}
	driver.close();

}
}
