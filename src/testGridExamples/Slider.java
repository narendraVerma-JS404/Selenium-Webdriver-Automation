package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		
		//driver.get("https://jqueryui.com/slider/#range");
		
		//Minimum Slider 
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI");
		WebElement minSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Location of the minimum slider : " +minSlider.getLocation());//getLoacation belongs to webelement  x axes and y axes
		System.out.println("Location of the minimum slider X : " +minSlider.getLocation().getX());
		System.out.println("Location of the minimum slider Y: " +minSlider.getLocation().getY());
		//58, 249
		
		ac.dragAndDropBy(minSlider,100,249).perform();
		System.out.println("Location of the minimum slider after moving : "+minSlider.getLocation());//161,250
		
		//Maximum slider
		WebElement maxSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Location of the max slider : " +maxSlider.getLocation());
		ac.dragAndDropBy(maxSlider,-100,249).perform();
		System.out.println("Location of the maximum slider after moving : "+maxSlider.getLocation());
		
		
		
		
		
		
		
	}
	

}
