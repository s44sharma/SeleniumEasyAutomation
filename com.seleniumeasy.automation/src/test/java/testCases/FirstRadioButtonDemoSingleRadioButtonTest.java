package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.CheckBoxDemoPage;
import pageObjects.FirstRadioButtonDemoPage;
import utilties.CommonMethod;

public class FirstRadioButtonDemoSingleRadioButtonTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifySingleRadioButton(){
		
		FirstRadioButtonDemoPage BFRBDPage = new FirstRadioButtonDemoPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		BFRBDPage.setSingleRadioMale();
		BFRBDPage.verifySingleButtonFunction();
		
	}
}
