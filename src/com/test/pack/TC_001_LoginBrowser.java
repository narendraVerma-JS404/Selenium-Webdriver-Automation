package com.test.pack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
public class TC_001_LoginBrowser  //class is user defined
      {
	public static void main(String[] args) throws Exception{
		
	
	    //WebDriver driver = new ChromeDriver();
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://183.82.103.245/nareshit/login.php");
	    Thread.sleep(4000);
	    
	    driver.close();
	}

}
