package testGridExamples;
//Pre-Def
import org.openqa.selenium.WebDriver;   //To access WebDriver methods & classes
import org.openqa.selenium.chrome.ChromeDriver;    //to access browser
import org.openqa.selenium.By;     //To access object identification/element locator:methods

public class TC001_Firefox {
	public static void main(String args[]) throws Exception{
    //Test Steps
	//Interface                  class
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php"); 
		Thread.sleep(4000);
		System.out.println("Application Opened");
		
		System.out.println("URL working correctly");
		driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		Thread.sleep(3000);
		System.out.println("Khatam-Khallash");
		System.out.println("testing is Excellent");
		driver.close();
	}		
}
