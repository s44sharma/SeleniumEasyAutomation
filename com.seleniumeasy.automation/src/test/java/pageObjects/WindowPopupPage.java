package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WindowPopupPage {
	WebDriver driver;

	public WindowPopupPage (WebDriver d){
		driver = d;
	}

	By TwitterButton = By.linkText("Follow On Twitter");
	By TwitterEmail    = By.xpath("//*[@id='layers']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[2]/form/div/div[1]/label/div/div[2]/div/input");
	By TwitterPassword = By.xpath("//*[@id='layers']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[2]/form/div/div[2]/label/div/div[2]/div/input");
	By TwitterNoThanks = By.xpath("//*[@id='layers']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/span/span/span");
	
	public void verifyFollowOnTwitterButton() throws InterruptedException{
		driver.findElement(TwitterButton).click();
		Thread.sleep(2000);
		System.out.println("Title of Parent Page is "+driver.getTitle());

		String MainWindow=driver.getWindowHandle();		

		// To handle all new opened window.				
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();		

		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();		

			if(!MainWindow.equalsIgnoreCase(ChildWindow))			
			{    		

				// Switching to Child window
				driver.switchTo().window(ChildWindow);	       
				System.out.println("Title of Child Page is "+driver.getTitle());
				driver.findElement(TwitterEmail).sendKeys("test@gmail.com");				
				driver.findElement(TwitterPassword).sendKeys("TestPassword");
				driver.findElement(TwitterNoThanks).click();
				// Closing the Child Window.
				driver.close();		
			}		
		}		
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);				
	}


}

