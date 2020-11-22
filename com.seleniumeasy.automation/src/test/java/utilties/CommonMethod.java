package utilties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonMethod {
	public WebDriver driver;

@BeforeMethod(alwaysRun = true)
@Parameters ("Browser")

// Initiate Browser
	public void initiateBrowser(String browser) {
	if (browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
	else{
		System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();	
	}

@AfterMethod (alwaysRun = true)
// Capture Screenshot in case of Failure
// Quit Browser
public void tearDown(ITestResult result) {
	
	if (ITestResult.FAILURE==result.getStatus()){
		ScreenshotMethod.captureScreenshot(driver, result.getName());
		System.out.println(result.getName()+" Failed");
	}
	else
	{
		System.out.println(result.getName()+" Passed");
	}
	driver.quit();
}

}
