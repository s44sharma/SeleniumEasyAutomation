package testCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import pageObjects.DragAndDropPage;
import utilties.CommonMethod;

public class DragAndDropTest extends CommonMethod {

	@Test (groups="Functional")
	
	public void verifyDragAndDrop(){
		
		DragAndDropPage DADPage = new DragAndDropPage(driver);
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		DADPage.verifyDragDropBox();
		
	}
}
