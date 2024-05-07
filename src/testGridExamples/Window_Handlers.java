package testGridExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class Window_Handlers {
	
	public static void main(String args[]) throws Exception{
		   //Test Steps
		WebDriver driver = new ChromeDriver();
		//1st wind
		driver.get("E:\\multiplewindows.html");
		Thread.sleep(3000);
		//2nd wind
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		//3rd wind
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> mwind = new ArrayList<>(driver.getWindowHandles());
		//switch To 1st wind
		driver.switchTo().window(mwind.get(0));
		Thread.sleep(3000);
		driver.close();
		//driver.quit();

	    }
	}

	
	