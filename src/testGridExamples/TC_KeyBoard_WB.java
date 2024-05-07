package testGridExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_KeyBoard_WB {
public static void main(String args[]) throws Exception{
	//TEST STEPS
		WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.google.com/");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys("Party all Night");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
Thread.sleep(4000);
driver.navigate().to("https://www.youtube.com/watch?v=NO2R_vOPrYo");
Thread.sleep(20000);

driver.close();

}

}
