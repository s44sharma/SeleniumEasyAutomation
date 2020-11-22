package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjects.BasicFirstFormDemoPage;

public class BasicFirstFormDemoClunkyTest{
	
	@Test (groups="Smoke")
	
	public void verifySingleInputField() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	// This will call BasicFirstFormDemoPage Constructor and pass driver to BasicFirstFormDemoPage
	BasicFirstFormDemoPage BFFDPage = new BasicFirstFormDemoPage(driver);
	
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	BFFDPage.setUserMessage("Raman's Test Message");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("at-cv-lightbox-close")).click();
	
	BFFDPage.verifyShowMessage();
	
	driver.quit();
	}

	@Test 
	public void verifyTwoInputFields() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	// This will call BasicFirstFormDemoPage Constructor and pass driver to BasicFirstFormDemoPage
	BasicFirstFormDemoPage BFFDPage = new BasicFirstFormDemoPage(driver);
	
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	
	int firstNumber = 5;
	int secondNumber = 8;
	
	BFFDPage.enterFirstNumber(firstNumber);
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("at-cv-lightbox-close")).click();	
	
	BFFDPage.enterSecondNumber(secondNumber);
	
	BFFDPage.calculateTotal();
	
	BFFDPage.verifyTotal();
	
	driver.quit();
	
	}
}
