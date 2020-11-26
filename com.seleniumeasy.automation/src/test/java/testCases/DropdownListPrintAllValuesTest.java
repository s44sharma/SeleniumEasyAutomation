package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.DropdownListPage;
import utilties.CommonMethod;
import utilties.Constant;

public class DropdownListPrintAllValuesTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifyDropdownListValues(){
		
		DropdownListPage DDLPage1 = new DropdownListPage(driver);
		
		driver.get(Constant.dropDownPageURL);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		DDLPage1.printListItems();
	}
}
