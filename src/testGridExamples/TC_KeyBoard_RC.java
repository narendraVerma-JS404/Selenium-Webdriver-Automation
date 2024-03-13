package testGridExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;

public class TC_KeyBoard_RC {
public static void main(String args[]) throws Exception{
	//TEST STEPS
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(4000);
//KEYBOARD :CLICK : TAB,ENTER
Robot r = new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(4500);
System.out.println("TAB BUTTON WORKING");
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(4500);
System.out.println("ENTER BUTTON WORKING");
System.out.println("Login Completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("LOGOUT COMPLETED");
driver.close();
     }
         }
