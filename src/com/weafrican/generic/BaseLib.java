	package com.weafrican.generic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
/**
 * 
 * @author Devesh
 *
 */

public class BaseLib {
	public WebDriver driver;
	@BeforeMethod
	@Parameters(value="browser")
	public void preCondition(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();//launched firefox browser
			Reporter.log("firefox Launched",true);//Print the report in console as well as report
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\Exefiles\\chromedriver.exe");//load the value of exe file
			driver = new ChromeDriver();//Launch chrome web driver
			driver.manage().window().maximize();//maximize the web driver
			Reporter.log("chrome Launched",true);
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",".\\Exefiles\\IEDriverServer.exe");
			driver.manage().window().maximize();
			Reporter.log("internet explorer launched",true);
		}
		else {
			driver = new FirefoxDriver();
			Reporter.log("Firefox launched",true);
		}
		    driver.manage().window().maximize();
		    driver.get(GetPropertyValues.getPropertyValues("testURL"));
		    WaitStatementLib.implicitWaitForSeconds(driver,20);
		   
	}
	@AfterMethod//this is testNG annotation run after every method of the script.
	public void postCondition(ITestResult result) {
		if(result.isSuccess()) {
			Reporter.log("Script passed",true);
		}
		else {
			String fileName = result.getMethod().getMethodName();
			ScreenShotLib slib = new ScreenShotLib();
			slib.getScreenshot(driver, fileName);//Call the method present inside Screenshoot generic class.
			Reporter.log("Screen shot has been taken",true);
		}
		driver.close();//to close the instance of the driver.
		Reporter.log("Browser close",true);//print message in the report as well as console.
	}

}
