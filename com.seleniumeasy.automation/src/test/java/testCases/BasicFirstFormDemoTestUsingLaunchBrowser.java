package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.BasicFirstFormDemoPage;
import utilties.CommonMethod;

public class BasicFirstFormDemoTestUsingLaunchBrowser extends CommonMethod{
	
	@Test (groups="Regression")
	
	public void verifySingleInputField () throws InterruptedException{
		
		
	// This will call BasicFirstFormDemoPage Constructor and pass driver to BasicFirstFormDemoPage
	BasicFirstFormDemoPage BFFDPage = new BasicFirstFormDemoPage(driver);
	
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	BFFDPage.setUserMessage("Raman's Test Message");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("at-cv-lightbox-close")).click();
	
	BFFDPage.verifyShowMessage();
	
	}
}
