package testGridExamples;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class ScrollPage 
        {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("//*[@id=\"contents\"]/span")).sendKeys("Selenium");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
	//	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	//	Thread.sleep(4000);
		
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
	}
	

}
