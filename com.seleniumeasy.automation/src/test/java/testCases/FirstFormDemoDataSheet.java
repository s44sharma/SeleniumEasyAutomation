package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pageObjects.FirstFormDemoPage;
import utilties.CommonMethod;

public class FirstFormDemoDataSheet extends CommonMethod{
	
	@Test (groups="Regression")
	
	public void verifyTwoInputFieldsNew() throws BiffException, IOException, InterruptedException {	
		
	FirstFormDemoPage BFFDPage = new FirstFormDemoPage(driver);
	
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	Workbook wbk = Workbook.getWorkbook(new File("./src/test/resources/TestData/Numbers.xls"));
	// import file java.io

	Sheet sh = wbk.getSheet("Sheet1");
	
	int firstNumber = Integer.parseInt(sh.getCell(0, 1).getContents());
		
	int secondNumber = Integer.parseInt(sh.getCell(1, 1).getContents());
		
	BFFDPage.enterFirstNumber(firstNumber);
	System.out.println(firstNumber);
	Thread.sleep(1000);
	
	driver.findElement(By.id("at-cv-lightbox-close")).click();
	
	BFFDPage.enterSecondNumber(secondNumber);	
	System.out.println(secondNumber);
	
	BFFDPage.calculateTotal();	
	
	String totalNumber = sh.getCell(2, 1).getContents();
	System.out.println("Total in sheet is "+totalNumber);
	
	BFFDPage.verifyTotalExcel(totalNumber);
	
	for (int i=2; i<sh.getRows();i++){
		int firstNumberLoop = Integer.parseInt(sh.getCell(0, i).getContents());
		BFFDPage.enterFirstNumber(firstNumberLoop);
		System.out.println(firstNumberLoop);
		
		int secondNumberLoop = Integer.parseInt(sh.getCell(1, i).getContents());
		BFFDPage.enterSecondNumber(secondNumberLoop);
		System.out.println(secondNumberLoop);
		
		Thread.sleep(1000);
		
		BFFDPage.calculateTotal();	
		
		String totalNumberLoop = sh.getCell(2, i).getContents();
		System.out.println("Total in sheet is "+totalNumberLoop);
		
		BFFDPage.verifyTotalExcel(totalNumberLoop);
		
		}
	
		}
}
