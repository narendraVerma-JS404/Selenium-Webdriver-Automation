package testGridExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySql_DB {
	
	public static void main(String[] args) throws Exception {
		
		
		//Test Steps
		String DBMSurl = "jdbc:mysql://localhost:3306/orangehrms";
		String DBMSun = "root";
		String DBMSpw = "SYSmgr@dbms01";

		Connection connc = DriverManager.getConnection(DBMSurl,DBMSun,DBMSpw);
		Statement st = connc.createStatement();
		ResultSet rs = st.executeQuery("select*from login");
		
		while(rs.next()) {
		String Username = rs.getString(1);
		String Passwords = rs.getString(2);
		System.out.println(Username);
		System.out.println(Passwords);
		
		//Application
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(Username);
		driver.findElement(By.name("txtPassword")).sendKeys(Passwords);
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		System.out.println("Brilliant-->Extremely Clever or Skillful @ Testing Exellent");
		}
		rs.close();
		st.close();
		connc.close();

}
}
