package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_IT {
	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://imgbb.com/");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"home-cover-content\"]/div[2]/a")).click();
		
		Runtime.getRuntime().exec("D:\\FileuploadScript.exe");
		
		Thread.sleep(10000);
		driver.close();
	}

}
