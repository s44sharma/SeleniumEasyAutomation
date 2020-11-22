package utilties;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotMethod {

	public static void captureScreenshot(WebDriver driver, String screenshotName){

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(source, new File("src/test/resources/Screenshots/"+screenshotName+".png"));
		} 
		catch (IOException e) {
			System.out.println("Exception Occurred"+e.getMessage());			e.printStackTrace();
		}
	}
}
