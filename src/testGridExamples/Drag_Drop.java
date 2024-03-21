package testGridExamples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	 public static void main(String args[]) throws Exception{
	       System.out.println("===");
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://jqueryui.com/droppable/");
	       Thread.sleep(4000);
	    
	       //Verify Title : stop exe : in case of cond: failed
	       
	       assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	       System.out.println("Title matched");
	       driver.switchTo().frame(0);
	       Actions ac = new Actions(driver);
	       ac.dragAndDrop(driver.findElement(By.id("draggable")),
	                driver.findElement(By.id("droppable"))).build().perform();
	       System.out.println("drag & Drop");
	       Thread.sleep(4000);
	       driver.switchTo().defaultContent();
	       driver.quit();

}
}
