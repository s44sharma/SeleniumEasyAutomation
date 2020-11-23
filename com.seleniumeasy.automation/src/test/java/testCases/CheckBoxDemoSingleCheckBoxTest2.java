package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.CheckBoxDemoPage;
import utilties.CommonMethod;

public class CheckBoxDemoSingleCheckBoxTest2 extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifySingleDemoCheckbox(){
		
		CheckBoxDemoPage BCBDPage = new CheckBoxDemoPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		BCBDPage.setSingleDemoCheckbox();
		
	}
}
