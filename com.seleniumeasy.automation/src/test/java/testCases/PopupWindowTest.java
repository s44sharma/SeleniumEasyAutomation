package testCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObjects.DragAndDropPage;
import pageObjects.WindowPopupPage;
import utilties.CommonMethod;
import utilties.Constant;

public class PopupWindowTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifyPopupWindow() throws InterruptedException{
		
		
		WindowPopupPage WPPPage = new WindowPopupPage(driver);
		
		driver.get(Constant.windowPopupPageURL);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WPPPage.verifyFollowOnTwitterButton();
		
	}
}
