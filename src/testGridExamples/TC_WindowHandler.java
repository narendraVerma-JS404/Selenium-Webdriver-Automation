package testGridExamples;
import java.time.Duration;
import java.util.ArrayList;     //ArrayList : to represent more data in runtime

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WindowHandler {
public static void main (String args[]) throws Exception{
	
	//TEST STEP
WebDriver driver = new ChromeDriver();
   
   //1st Window
driver.get("https://www.irctctourism.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
System.out.println("IRCTC Web Page Open");

   //2nd Window
driver.findElement(By.xpath("/html/body/app-root/tourpkgs/div[2]/div[2]/ul/li[2]/a/div")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
System.out.println("Enjoy Your Days");
    //3rd Window
driver.findElement(By.xpath("/html/body/app-root/tourpkgs/div[2]/div[2]/ul/li[1]/a/div")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
System.out.println("Fly in The SKY");

ArrayList<String>mulwind = new ArrayList<>(driver.getWindowHandles());//it will retrive multiple windows information

    //Switch to First Window
driver.switchTo().window(mulwind.get(0));
Thread.sleep(3500);
//driver.close();  //to close active windows
driver.quit(); //to close all browser 
}

}
