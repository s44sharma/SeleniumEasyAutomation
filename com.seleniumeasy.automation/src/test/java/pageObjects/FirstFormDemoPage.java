package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstFormDemoPage{

	
	WebDriver driver;
	
	//Example Type 1 Part 1
	By UserMessage = By.id("user-message");
	By ShowMessage = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button");
	By EnterValueforA = By.id("sum1");
	By EnterValueforB = By.id("sum2");
	By GetTotal = By.xpath("//*[@id='gettotal']/button");

	// Whenever the objects of this class are created, this constructor will get driver from outside and assign to this class.	

	public FirstFormDemoPage (WebDriver d){
		driver = d;
	}	
	//Example Type 1 Part 2
	// This method will receive User defined Message from calling method and pass those values to userMessage
	public void setUserMessage(String userMessage){
		driver.findElement(UserMessage).clear();
	
		driver.findElement(UserMessage).sendKeys(userMessage);

	}

	public void verifyShowMessage() {
		driver.findElement(ShowMessage).click();

		String expectedText = "Raman's Test Message";
		String displayedText = driver.getPageSource();

		if (displayedText.contains(expectedText))
		{
			System.out.println("Raman's Test Message gets dispayed on screen");
		}	

		else
		{
			System.out.println("Raman's Test Message not displayed on screen");
		}
	}

	public void enterFirstNumber(int firstNumber){
		driver.findElement(EnterValueforA).clear();
		driver.findElement(EnterValueforA).sendKeys(String.valueOf(firstNumber));
	}

	public void enterSecondNumber(int secondNumber){
		driver.findElement(EnterValueforB).clear();
		driver.findElement(EnterValueforB).sendKeys(String.valueOf(secondNumber));
	}

	public void calculateTotal() {
		driver.findElement(GetTotal).click();

	}			


	public void verifyTotalExcel(String expectedText) {

		String displayedText = driver.getPageSource();

		if (displayedText.contains(expectedText))
		{
			System.out.println("Calculate Total is " + expectedText);
		}	
		else
		{
			System.out.println("Wrong Calculations");
		}
	}

	public void verifyTotal() {

		String expectedText = ("13");
		String displayedText = driver.getPageSource();

		if (displayedText.contains(expectedText))
		{
			System.out.println("Calculate Total is " + expectedText);
		}	
		else
		{
			System.out.println("Wrong Calculations");
		}
	}

}

