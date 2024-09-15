package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {
	
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books.pwakit.appspot.com");
		
		//THis Element is inside shadow DOM
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(3000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
		//driver.findElement(By.cssSelector("#input")).sendKeys("WELCOME");//NoSuchElementException
	}

}
