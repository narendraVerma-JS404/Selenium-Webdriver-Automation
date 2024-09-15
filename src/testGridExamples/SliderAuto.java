package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAuto {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Revenue Calculator")).click();
		
		Thread.sleep(3500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		
		WebElement slider = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]"));
		
		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		ac.clickAndHold(slider).moveByOffset(93, 0).release().perform();
		
	}
	

}
