package testCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObjects.DragAndDropPage;
import utilties.CommonMethod;
import utilties.Constant;

public class DragAndDropTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifyDragAndDrop(){
		
		DragAndDropPage DADPage = new DragAndDropPage(driver);
		
		driver.get(Constant.dragDropPageURL);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		DADPage.verifyDragDropBox();
		
	}
}
