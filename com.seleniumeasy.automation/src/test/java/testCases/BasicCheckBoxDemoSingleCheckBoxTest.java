package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.BasicCheckBoxDemoPage;
import utilties.CommonMethod;

public class BasicCheckBoxDemoSingleCheckBoxTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifySingleDemoCheckbox(){
		
		BasicCheckBoxDemoPage BCBDPage = new BasicCheckBoxDemoPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		BCBDPage.setSingleDemoCheckbox();
		
	}
}
