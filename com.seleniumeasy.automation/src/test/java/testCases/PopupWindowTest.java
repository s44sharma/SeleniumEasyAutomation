package testCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObjects.DragAndDropPage;
import pageObjects.WindowPopupPage;
import utilties.CommonMethod;

public class PopupWindowTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifyPopupWindow() throws InterruptedException{
		
		
		WindowPopupPage WPPPage = new WindowPopupPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WPPPage.verifyFollowOnTwitterButton();
		
	}
}
