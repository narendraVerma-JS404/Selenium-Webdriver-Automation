package testGridExamples;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poi_ExcelLogin {
	
	    public static void main(String[] args) throws Exception {
	        WebDriver driver = null;
	        FileInputStream fs = null;
	        
	        try {
	            fs = new FileInputStream("D:\\xl\\LoginApplication.xlsx");
	            XSSFWorkbook workbook = new XSSFWorkbook(fs);
	            XSSFSheet sheet = workbook.getSheetAt(0);
	            
	            String Username = sheet.getRow(1).getCell(0).getStringCellValue(); // Adjusted cell indexing
	            String Password = sheet.getRow(1).getCell(1).getStringCellValue(); // Adjusted cell indexing
	            
	            // Enter into application
	            driver = new ChromeDriver();
	            driver.get("http://183.82.103.245/nareshit/login.php");
	            System.out.println("Application opened");
	            
	            driver.findElement(By.name("txtUserName")).sendKeys(Username);
	            driver.findElement(By.name("txtPassword")).sendKeys(Password);
	            Thread.sleep(3000);
	            
	            driver.findElement(By.name("Submit")).click();
	            Thread.sleep(3000);
	            System.out.println("Login completed");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (driver != null) {
	                driver.quit(); // Close the browser after login
	            }
	            if (fs != null) {
	                fs.close(); // Close the file input stream
	            }
	        }
	    }
	

		 

}

