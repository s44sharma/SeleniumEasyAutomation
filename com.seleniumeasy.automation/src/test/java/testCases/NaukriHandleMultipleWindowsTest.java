package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.CheckBoxDemoPage;
import pageObjects.NaukriMainPage;
import utilties.CommonMethod;
import utilties.Constant;

public class NaukriHandleMultipleWindowsTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void handleMultipleWindows() throws InterruptedException{
		
		NaukriMainPage NMPage = new NaukriMainPage(driver);
		
		driver.get(Constant.naukriURL);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		NMPage.handleMultipleWindows();
		
	}
}
