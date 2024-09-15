package testGridExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ButtonsLetCode 
      {
	 
	public static void main(String[] args) throws Exception
	 {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Chrome Maximize successfully");
		
		driver.navigate().to("https://letcode.in/buttons");
		Thread.sleep(2000);
		System.out.println("Application open Done!!!!!");
		
		WebElement e=driver.findElement(By.xpath("//button[@title='Disabled button']"));
		e.isEnabled();
		System.out.println(e.isEnabled());
		
		String btn = driver.findElement(By.xpath("/html/body/app-root/app-buttons/app-pageheader/section/div/div/h1")).getText();
		System.out.println(btn);
		
		System.out.println("Button Text Reterive");
		Thread.sleep(4500);
		
		WebElement textOnButtonElement = driver.findElement(By.xpath("/html/body/app-root/app-buttons/app-pageheader/section/div/div/h1"));
		String actualtextSize = textOnButtonElement.getCssValue("font-weight");
		System.out.println("Button Size : "+actualtextSize);
		Thread.sleep(4500);
		
		
		String str = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[1]/label")).getText();
		System.out.println("Text Reterive : "+str);
		Thread.sleep(4500);
		
		String accuratetextSize = textOnButtonElement.getCssValue("font-size");
		System.out.println("Text Size : "+accuratetextSize);
		Thread.sleep(4500);
		
		String textColor = textOnButtonElement.getCssValue("color");
		System.out.println("Text Color : "+textColor);
		Thread.sleep(4500);
		
		String bgColor = textOnButtonElement.getCssValue("background-color");
		System.out.println("Text Background color : "+bgColor);
		Thread.sleep(4500);
		
		String fontColor = textOnButtonElement.getCssValue("color");
		System.out.println("Text Font color : "+fontColor);
		Thread.sleep(4500);
		
		String height = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[4]/label")).getText();
		System.out.println(height);
		
		String heights = textOnButtonElement.getCssValue("height");
		System.out.println("Text height : "+heights);
		Thread.sleep(4500);
		String width = textOnButtonElement.getCssValue("border-width");
		System.out.println("Text width : "+width);
		Thread.sleep(4500);
		
		String gotoHome = driver.findElement(By.xpath("//button[@id='home']")).getText();
		System.out.println(gotoHome);
		Thread.sleep(4500);
		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Thread.sleep(4500);
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		Thread.sleep(4500);
		
		String strBox = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/div/div/span")).getText();
		System.out.println(strBox);
		Thread.sleep(4500);
		
		String click = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).getText();
		System.out.println(click);
		Thread.sleep(4500);
		
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		Thread.sleep(4500);
		String clickHold = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[6]/label")).getText();
		System.out.println("Click and Hold Button process using KeyBoard : "+clickHold);
		Thread.sleep(4500);
		
	
		
		
		
		//Scroll
		
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
		
		
		 // Find the button element
        WebElement button = driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
        
       
        // Create Actions class instance
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[5]/div/button"))).perform();
    	Thread.sleep(5000);
    	
        //Click and hold the button
        actions.clickAndHold(button).perform();
        Thread.sleep(6000);
        System.out.println("Before Click & Hold : Button Hold!!!!");

        // Release the button
        actions.release().perform();  //*[@id="isDisabled"]/div/h2
        System.out.println("After Click & Hold : Button Has been Long Pressed!!!!");
        
        String desable = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[5]/label")).getText();
        System.out.println(desable);
        
    	//Actions ac = new Actions(driver);
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
