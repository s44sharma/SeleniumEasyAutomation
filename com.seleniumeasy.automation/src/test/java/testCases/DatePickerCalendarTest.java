package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.DatePickerPage;
import utilties.CommonMethod;

public class DatePickerCalendarTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifyDatePickerCalendar() throws InterruptedException{
		
		DatePickerPage DPCPage = new DatePickerPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		DPCPage.setCalendarDate();
	
	}
}
