package testGridExamples;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alerts {
public static void main(String args[]) throws Exception{
	//TEST STEPS
	WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");

Thread.sleep(3500);
driver.findElement(By.name("Submit")).click();
System.out.println("Login Completed");
Thread.sleep(3500);
Alert a = driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
Thread.sleep(4000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("Login Completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout Completed");
System.out.println("Testing Excellent");
driver.close();
	}

      }
