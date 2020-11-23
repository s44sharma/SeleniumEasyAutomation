package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FirstRadioButtonDemoPage{

	
	WebDriver driver;
	
	//Example Type 1 Part 1
	
	By SingleRadioMale = By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]/input");
	By GetCheckedValue = By.id("buttoncheck");

	// Whenever the objects of this class are created, this constructor will get driver from outside and assign to this class.	

	public FirstRadioButtonDemoPage (WebDriver d){
		driver = d;
	}	
	//Example Type 1 Part 2
	// This method will receive User defined Message from calling method and pass those values to userMessage
	public void setSingleRadioMale(){
		driver.findElement(SingleRadioMale).click();
	}
	
	public void verifySingleButtonFunction() {
		driver.findElement(GetCheckedValue).click();

		String expectedText = "Radio button 'Male' is checked";
		String displayedText = driver.getPageSource();

		if (displayedText.contains(expectedText))
		{
			displayedText = "Radio button 'Male' is checked";
		}	

		Assert.assertEquals(expectedText, displayedText);
	}

}

