package testGridExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_WebTBL {
public static void main (String args[]) throws Exception{
	
	//TEST STEPS
WebDriver driver = new ChromeDriver();
driver.get("file:///E:/WebTable.html");

   //COUNT

int row = driver.findElements(By.xpath("//'[@id='idCourse'])/tbody/tr")).size();

int col =driver.findElements(By.xpath("//'[@id='idCourse']/tbody/tr[1]/td")).size();

int row_col = driver.findElements(By.xpath("//'[@id='idCourse']/tbody/tr/td")).size();

         System.out.println("Row Count" + row);
         System.out.println("Col Count" + col);
         System.out.println("Row_col Count" + row_col);
         
         //DATA CELL
         
String celldata = driver.findElement(By.xpath("//'[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
        
         System.out.println("celldata");
         
         //Data ----Tables
         //DT     Var  VV
          for(int i  = 1;i<=row;i++) {
          String data = driver.findElement(By.xpath("//'[@id='idCourse']/tbody/tr["+i+"]")).getText();
          System.out.println("data");
          Thread.sleep(3500);
          }
          driver.quit();
          }
}


