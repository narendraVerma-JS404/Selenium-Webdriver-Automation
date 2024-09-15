package testGridExamples;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	/*Broken Links is a link which dosen't have any resource in the server
	 *if it is dosen't have any resource in the server that will return status code
	 *that should be greater than or equal to 400
	 */
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links : "+ links.size());
		
		int noOfBrokenLinks = 0;
		for(WebElement linkElement : links)
		{
			String hrefAttributeValue = linkElement.getAttribute("href");
			
			if(hrefAttributeValue==null  || hrefAttributeValue.isEmpty())
			{
				System.out.println("Href value is empty or null ..so not possiblew to check");
				continue;
			}
			//Hit url to the server 
			try
			{
				
			URL  linkURL = new URL(hrefAttributeValue);//Converted href value ssssstring to url format 
			HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();//Open connection to the server 
			conn.connect();//connect to server and sent request the server
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println("Broken links =============> "+hrefAttributeValue);
				noOfBrokenLinks++;
			}
			else 
			{
				System.out.println("Not a broken links =============> "+hrefAttributeValue);
			}
			}
			catch(Exception e)
			{
				System.out.println("Print Exception: "+e);
			}
		}
		System.out.println("No. of broken links : "+noOfBrokenLinks);
			
	}

}

