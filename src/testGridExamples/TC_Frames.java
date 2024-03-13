package testGridExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;    //To Access Browser
import org.openqa.selenium.By;


public class TC_Frames {
public static void main(String args[]) throws Exception{
	//Test Step
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3500);
driver.findElement(By.name("Submit")).click();
System.out.println("Login Completed");
Thread.sleep(3500);

//INTER INTO FRAME
driver.switchTo().frame("rightMenu");

//CLICK ON ADD BUTTON

driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(4000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("NARENDRA");
driver.findElement(By.name("txtEmpLastName")).sendKeys("VERMA");
Thread.sleep(4500);
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3800);
System.out.println("NEW EMPLOYEE ADDED");

//EXIT FROM FRAME
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
System.out.println("Logout completed");
System.out.println("Testing Excellent");
driver.close();
}
}