package testGridExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationWebTable {
	
	public static void main(String[] args) {
		
		 // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://testautomationpractice.blogspot.com/");

        // Find the table
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));

        // Print the headers of the table
        List<WebElement> headers = table.findElements(By.tagName("th"));
        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
        }
        System.out.println();

        // Print data from each page
        while (true) {
            // Print data from current page
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            for (int i = 1; i < rows.size(); i++) { // Start from 1 to skip header row
                List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
                for (WebElement cell : cells) {
                    System.out.print(cell.getText() + "\t");
                }
                System.out.println();
            }

             //Check for next page button and click it
           WebElement nextPageButton = driver.findElement(By.xpath("//button[contains(text(), 'Next')]"));
           if (!nextPageButton.isEnabled()) {
                break; // Break the loop if next page button is disabled
            }
            nextPageButton.click();
        }

        // Close the browser
        driver.quit();
    }
}
	


