package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.DatePickerPage;
import utilties.CommonMethod;
import utilties.Constant;

public class DatePickerCalendarTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifyDatePickerCalendar() throws InterruptedException{
		
		DatePickerPage DPCPage = new DatePickerPage(driver);
		
		driver.get(Constant.dataPickerPageURL);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		DPCPage.setCalendarDate();
	
	}
}
