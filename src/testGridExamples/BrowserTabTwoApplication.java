package testGridExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTabTwoApplication {
  
	  public static void main(String[] args) throws Exception{
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://demo.opencart.com/admin/");
		  Thread.sleep(5000);
		  driver.switchTo().newWindow(WindowType.TAB);//Selenium 4.x
		  Thread.sleep(5000);
		  driver.get("https://www.orangehrm.com/en/");
		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.get("https://testautomationpractice.blogspot.com/");
		  //Skills speak louder than words
		  driver.quit();
		
	}
}
