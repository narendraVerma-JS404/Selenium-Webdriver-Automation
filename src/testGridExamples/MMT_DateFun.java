package testGridExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

public class MMT_DateFun {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
	    Actions ac = new Actions(driver);
	    Screen sc=new Screen();
	    sc.click("C:\\Users\\Dharmendra Verma\\Downloads\\close.PNG");
	    ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/span/a/span[2]"))).perform();
	    ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[3]/label/span"))).perform();
		
	    //WAIT FOR LOGIN BUTTON : ExplicitWait

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[3]/label/span"))));
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[3]/label/span")).click();
		driver.findElement(By.xpath("//div[@aria-label='Wed Apr 10 2024']//p[contains(text(),'10')]")).click();
		 Actions at = new Actions(driver);
		at.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Return']"))).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Return']")).click();
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]/div/p[1]")).click();
		Thread.sleep(60000);
	    driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/abbr")).sendKeys("We");
	   
	   driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")).click();
	}
	

}
