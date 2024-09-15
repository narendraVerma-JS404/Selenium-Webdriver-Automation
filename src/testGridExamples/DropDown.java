package testGridExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropDown 
     {
	  public static void main(String[] args) throws Exception
	 {
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropdowns");
	String ddText1 = driver.findElement(By.xpath("/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/label")).getText();
	System.out.println(ddText1);
	
	String ddText2 = driver.findElement(By.id("fruits")).getText();
	System.out.println(ddText2);
	
	driver.findElement(By.id("fruits")).click();
	Thread.sleep(4500);
	System.out.println("Click on Fruits Dropdown successfully");
	
	Select st = new Select(driver.findElement(By.id("fruits")));
//	st.selectByVisibleText("Apple");
//	driver.findElement(By.id("fruits")).click();
//	
//	st.selectByValue("2");
//	driver.findElement(By.xpath("fruits")).click();
//	
	 st.selectByIndex(0);
	 driver.findElement(By.xpath("fruits")).click();
	
//	String ddText3 = driver.findElement(By.xpath("/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/div/div")).getText();
//	System.out.println(ddText3);
//	Thread.sleep(3000);
	
	WebElement textOnObjectElement = driver.findElement(By.xpath("/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/div/div"));
	String actualColor = textOnObjectElement.getCssValue("color");
	System.out.println("Button Color : "+actualColor);
	
	String fontSize    = textOnObjectElement.getCssValue("font-size");
	System.out.println("Button Font Size : "+fontSize);
	
	String fontHeight    = textOnObjectElement.getCssValue("line-height");
	System.out.println("Button Font Height : "+fontHeight);
	
	String fontWeight    = textOnObjectElement.getCssValue("font-weight");
	System.out.println("Font Weight of text : "+fontWeight);
	
	
	Thread.sleep(4500);
	
	System.out.println("<=================================>");
	
	WebElement selectElement = driver.findElement(By.xpath("/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/div/div[2]/div/p"));
	// Check if the select element allows multiple selections
	selectElement.isEnabled();
	System.out.println(selectElement.isEnabled());
    
	// Create a Select object
    Select select = new Select(driver.findElement(By.id("fruits")));

    // Check if the select element allows multiple selections
    if (select.isMultiple()) {
        System.out.println("The select element allows multiple selections.");

        // Select multiple options
        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Mango");
        select.selectByVisibleText("Orange");
       
        select.selectByIndex(5);
        
        // Add more selection methods here as needed
    } else {
        System.out.println("The select element allows only single selection.");
    }
    
   

    // Close the browser
    driver.quit();


				}

}
