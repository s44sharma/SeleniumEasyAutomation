package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownListPage {
	WebDriver driver;

	public DropdownListPage (WebDriver d){
		driver = d;
	}

	By DayList = By.id("select-demo");
	By PrintMeButton = By.id("printMe");
	By PrintAllButton = By.id("printAll");
	By FirstListItem = By.xpath("//*[@id='multi-select']/option[1]");
	By FirstDisplayedMessage =  By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]");

	public void setDayList(){
		WebElement dayofWeek = driver.findElement(DayList);

		Select daysofWeek = new Select(dayofWeek);
		daysofWeek.selectByIndex(1);

		String expectedDayofWeek = "Sunday";
		String displayedDayofWeek = driver.getPageSource();

		if (displayedDayofWeek.contains(expectedDayofWeek))
		{
			displayedDayofWeek = "Sunday";
		}

		System.out.println(dayofWeek.getSize());	
		System.out.println("Selected Day of the Week is "+displayedDayofWeek);	
		Assert.assertEquals(expectedDayofWeek, displayedDayofWeek);

		//	Assert.assertNotEquals(expectedTextCheckBox, displayedTextCheckBox);
	}

	public void printListItems(){
		WebElement dayofWeek = driver.findElement(DayList);
		List<WebElement> daySofWeek = dayofWeek.findElements(By.tagName("option"));

		for (int i=0; i<daySofWeek.size();i++){
			// months.size will give size of months list

			System.out.println(daySofWeek.get(i).getText());
		}
	}
	
	public void selectMultipleListItems() throws InterruptedException{
		
		driver.findElement(FirstListItem).click();
				
		driver.findElement(PrintMeButton).click();
		
//		Thread.sleep(2000);	
		
		String expectedCityMessage = "First selected option is : California";
		String displayedCityMessage = driver.findElement(FirstDisplayedMessage).getText();
		System.out.println(displayedCityMessage);		
		
		Assert.assertEquals(displayedCityMessage, expectedCityMessage);
		
		Actions obj = new Actions(driver);
		obj.keyDown(Keys.CONTROL)
		
		.click(driver.findElement(By.xpath("//*[@id='multi-select']/option[2]")))
		.click(driver.findElement(By.xpath("//*[@id='multi-select']/option[3]")))
		.keyUp(Keys.CONTROL).build().perform();
				
		driver.findElement(PrintAllButton).click();
//		Thread.sleep(2000);	
		
		String expectedCityMessageAll = "Options selected are : California,Florida,New Jersey";
		String displayedCityMessageAll = driver.findElement(FirstDisplayedMessage).getText();
		System.out.println(displayedCityMessageAll);	

		Assert.assertEquals(displayedCityMessageAll, expectedCityMessageAll);

		}

		
}