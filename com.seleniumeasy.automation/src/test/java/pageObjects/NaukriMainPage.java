package pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NaukriMainPage {
	WebDriver driver;

	public NaukriMainPage (WebDriver d){
		driver = d;
	}

	By SearchRecruiters = By.xpath(".//a[@title='Search Recruiters']");
	By LoginLayer = By.id("login_Layer");

	public void handleMultipleWindows() throws InterruptedException{
	
		String parentHandle = driver.getWindowHandle();	
		driver.findElement(SearchRecruiters).click();

		Thread.sleep(5000);
		Object ids[] = driver.getWindowHandles().toArray();
		
		System.out.println(ids);
		
		driver.switchTo().window(ids[1].toString());
		driver.findElement(LoginLayer).click();
		
		driver.close();
		driver.switchTo().window(parentHandle).toString();
		System.out.println(driver.getTitle());

	}
}

