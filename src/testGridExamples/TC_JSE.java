package testGridExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class TC_JSE {
public static void main(String args[]) throws Exception{
   
	//TEST STEPS
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");

//USING JAVA SCRIPT EXECUTOR TO CLICK ON LOGIN BTN

WebElement element = driver.findElement(By.name("Submit"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();",element);
Thread.sleep(4000);
System.out.println("Login completed");

//USING JAVASCRIPT EXECUTOR TO CLICK ON LOGOUT BTN

WebElement logout= driver.findElement(By.linkText("Logout"));
JavascriptExecutor executor1 = (JavascriptExecutor)driver;
executor1.executeScript("arguments[1].click();",logout);       //if i provide value argt=0 it will be run
System.out.println("Logout completed");

driver.close();
}
}
