package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownListPage {
	WebDriver driver;

	public DropdownListPage (WebDriver d){
		driver = d;
	}

	By DayList = By.id("select-demo");

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
}
