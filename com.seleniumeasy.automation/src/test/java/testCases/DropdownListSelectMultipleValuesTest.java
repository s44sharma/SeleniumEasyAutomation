package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.DropdownListPage;
import utilties.CommonMethod;

public class DropdownListSelectMultipleValuesTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void selectDropdownListValues() throws InterruptedException{
		
		DropdownListPage DDLPage2 = new DropdownListPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		DDLPage2.selectMultipleListItems();
	}
}
