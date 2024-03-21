package testGridExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Verification {
public static void main(String args[]) throws Exception{
	//interface              class
	WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(3000);
//Verify Title
//Actual result                Compare expected result
if(driver.getTitle().equals("OrangeHRM-Jaan de denge")){
	System.out.println("Title Matched");
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
		}
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("Login completed");

//verify title2
if(driver.getTitle().equals("OrangeHRM")) {
System.out.println("Title matched");
}
else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
}

driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
System.out.println("Testing Excellent");
driver.close();
}
}


