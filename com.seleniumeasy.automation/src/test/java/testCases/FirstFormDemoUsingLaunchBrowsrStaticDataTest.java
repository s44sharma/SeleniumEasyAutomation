package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.FirstFormDemoPage;
import utilties.CommonMethod;

public class FirstFormDemoUsingLaunchBrowsrStaticDataTest extends CommonMethod{
	
	@Test (groups="Smoke")
	public void verifyTwoInputFields() throws InterruptedException{	
	// This will call BasicFirstFormDemoPage Constructor and pass driver to BasicFirstFormDemoPage
	FirstFormDemoPage BFFDPage = new FirstFormDemoPage(driver);
	
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	int firstNumber = 5;
	int secondNumber = 8;
	
	BFFDPage.enterFirstNumber(firstNumber);
	
	Thread.sleep(1000);
	
	Boolean isPresent = driver.findElements(By.id("at-cv-lightbox-close")).size() > 0;

	if(isPresent) {
		driver.findElement(By.id("at-cv-lightbox-close")).click();
	}
	
	BFFDPage.enterSecondNumber(secondNumber);
	
	BFFDPage.calculateTotal();
	
	BFFDPage.verifyTotal();
	
	}
}
