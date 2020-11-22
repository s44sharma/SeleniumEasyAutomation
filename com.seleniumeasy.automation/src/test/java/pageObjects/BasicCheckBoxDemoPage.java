package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasicCheckBoxDemoPage {
	WebDriver driver;

	public BasicCheckBoxDemoPage (WebDriver d){
		driver = d;
	}

	By SingleCheckBox = By.id("isAgeSelected");

	public void setSingleDemoCheckbox(){
		driver.findElement(SingleCheckBox).click();

		String expectedTextCheckBox = "Check box is checked";
		String displayedTextCheckBox = driver.getPageSource();
		
		if (displayedTextCheckBox.contains(expectedTextCheckBox))
		{
			displayedTextCheckBox = "Check box is checked";
		}
		
	Assert.assertEquals(expectedTextCheckBox, displayedTextCheckBox);
					
//	Assert.assertNotEquals(expectedTextCheckBox, displayedTextCheckBox);
	

	}
}

