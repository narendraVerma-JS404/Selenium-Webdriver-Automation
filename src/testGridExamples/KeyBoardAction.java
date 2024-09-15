package testGridExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Testing");
		
		Actions ac = new Actions(driver);
		//Ctrl+A === Select all
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		System.out.println("perform ctrl+a : completed");
		
		//Ctrl+c
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		System.out.println("perform ctrl+c : completed");
		//Tab
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		System.out.println("perform tab button : completed");
		//Ctrl+v
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		System.out.println("perform ctrl+v : completed");
		
		// ctrl+SHoift+a
		ac.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("Welcome to Testing").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
		//Enter
		ac.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
		
			
		
	}

}
