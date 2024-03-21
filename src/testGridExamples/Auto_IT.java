package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_IT {
	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://upload.photobox.com/en/#computer");
		driver.findElement(By.xpath("//button[@id='button_desktop']")).click();
		
		Runtime.getRuntime().exec("D:\\FileuploadScript.exe");
		Thread.sleep(3000);
	}

}
