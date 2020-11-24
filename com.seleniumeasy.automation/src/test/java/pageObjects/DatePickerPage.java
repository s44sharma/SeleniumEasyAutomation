package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage {
	WebDriver driver;

	public DatePickerPage (WebDriver d){
		driver = d;
	}

	By CalendarButton = By.xpath("//*[@id='sandbox-container1']/div/span");
	By TodayButton = By.xpath("/html/body/div[3]/div[1]/table/tfoot/tr[1]/th");
	By DateInputBox = By.xpath("//*[@id='sandbox-container1']/div/input");
	
	
	public void setCalendarDate() throws InterruptedException{
		driver.findElement(CalendarButton).click();
		driver.findElement(TodayButton).click();
		
		Object displayedDate = driver.findElement(DateInputBox).getText();
		
		System.out.println("Displayed Date is "+displayedDate);
		
	}
}

