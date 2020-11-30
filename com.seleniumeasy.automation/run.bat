set projectLocation=C:\Users\Home\git\SeleniumEasyAutomation\com.seleniumeasy.automation
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause