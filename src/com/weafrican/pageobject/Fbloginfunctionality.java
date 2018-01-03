package com.weafrican.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weafrican.generic.WaitStatementLib;

public class Fbloginfunctionality {
	@FindBy(xpath="//input[@id='email']")
	private WebElement Emailidfield;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement PasswrdFld;
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement FbLoginBtn;
	public Fbloginfunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void Fblogin(String username,String password,WebDriver driver ) throws InterruptedException {
		Emailidfield.sendKeys(username);
		Thread.sleep(100);
		PasswrdFld.sendKeys(password);
		Thread.sleep(100);
		FbLoginBtn.click();
		WaitStatementLib.implicitWaitForMinute(driver, 10);
		
	}

}
