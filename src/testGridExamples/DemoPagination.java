package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPagination {
	
	public static void main(String[] args) throws Exception{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://letcode.in/advancedtable");
		System.out.println("Application Opened");
		Thread.sleep(3500);
		Select st = new Select(driver.findElement(By.xpath("//select[@name='advancedtable_length']")));
		st.selectByIndex(0);
		
		Thread.sleep(3500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
//		String Data = driver.findElement(By.xpath("//*[@id=\"advancedtable_length\"]")).getText();
//		System.out.println(Data);
//		
//		String TextData = driver.findElement(By.xpath("//div[@id='advancedtable_info']")).getText();
//		System.out.println(TextData);
//		
//		String totalPage = driver.findElement(By.xpath("//*[@id=\"advancedtable_paginate\"]/span")).getText();
//		System.out.println("Total Page is : "+totalPage);
//		

        // Locate the element containing the text
        WebElement entriesElement = driver.findElement(By.xpath("//div[@id='advancedtable_info']"));

        // Get the text from the element
        String text = entriesElement.getText();
        System.out.println(text);

        // Extract the number of entries
        String numberOfEntries = extractNumberOfEntries(text);

        // Print the number of entries
        System.out.println("Number of entries: " + numberOfEntries);

        // Close the browser
        driver.quit();
    }

    public static String extractNumberOfEntries(String text) {
        // "Showing 1 to 5 of 47 entries"
        int startIndex = text.indexOf("of") + 3; // "of " is 3 characters long
        int endIndex = text.indexOf("entries") - 1; // " entries" is 8 characters long
        return text.substring(startIndex, endIndex).trim();
        
//        for(int p=1; p<=5; p++)
//        {
//        	if(p>1)
//        		Thread.sleep(3500);
//        	    System.out.println("<==============Next page will be open ==============>");
//        	    Thread.sleep(3500);
//        	    { 
            	    //WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
        	    	//activePage.click();
    	
    	
    	
    	
    	
    	

    }


}