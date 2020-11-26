package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.FirstRadioButtonDemoPage;
import utilties.CommonMethod;
import utilties.Constant;

public class FirstRadioButtonDemoSingleRadioButtonTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifySingleRadioButton(){
		
		FirstRadioButtonDemoPage BFRBDPage = new FirstRadioButtonDemoPage(driver);
		
		driver.get(Constant.radioButtonPageURL);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		BFRBDPage.setSingleRadioMale();
		BFRBDPage.verifySingleButtonFunction();
		
	}
}
