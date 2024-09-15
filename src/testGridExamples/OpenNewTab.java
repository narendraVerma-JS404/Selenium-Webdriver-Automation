package testGridExamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {
      
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//KeyBoard action
		WebElement regLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		
		//Switching to registration page
		List<String> ids = new ArrayList(driver.getWindowHandles());
	    driver.switchTo().window(ids.get(1));//switch to registration page
	    Thread.sleep(5000);
	    
	    driver.switchTo().window(ids.get(0));
		driver.quit();
		}
}
