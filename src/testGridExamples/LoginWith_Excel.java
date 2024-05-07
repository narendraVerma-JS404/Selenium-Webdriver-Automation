package testGridExamples;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class LoginWith_Excel {
	
	public static void main(String[] args) throws Exception{
		
	
	     
		   //Excel
	  
		   FileInputStream file = new FileInputStream("C:\\Users\\Dharmendra Verma\\Desktop\\unpw.xls");
	   Workbook wb = Workbook.getWorkbook(file);
	   
	   Sheet st = wb.getSheet(0);
	   String username = st.getCell(0,1).getContents();
	   String password = st.getCell(1,1).getContents();
	   System.out.println("From Excel We are Take Login and Password");
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://183.82.103.245/nareshit/login.php");
	   System.out.println("Application opened");                           //console
	                                   // html Report
	   
	   driver.findElement(By.name("txtUserName")).sendKeys(username);
	   driver.findElement(By.name("txtPassword")).sendKeys(password);
	   Thread.sleep(3000);
	  
	   
	   driver.findElement(By.name("Submit")).click();
	   Thread.sleep(3000);
	   System.out.println("Login completed");
	   
	   
	   driver.findElement(By.linkText("Logout")).click();
	   
	   driver.close();
	   

}
}
