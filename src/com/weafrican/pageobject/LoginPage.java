package com.weafrican.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weafrican.generic.WaitStatementLib;

public class LoginPage {
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailTxtBx;
	@FindBy(xpath="//input[@id='password']")
	private WebElement PswTxtBx;
	@FindBy(xpath="//input[@id='termsChkbx']")
	private WebElement TrmChkBx;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement LogInBtn;
	@FindBy(xpath="//a[@class='btn btn-link forget-pass']")
	private WebElement FgtPassLink;
	@FindBy(id="eye")
	private WebElement ShowPass;
	@FindBy(id="social-facebook")
	private WebElement SocialLoginBtn;
	@FindBy(id="social-google")
	private WebElement MailLoginBtn;
	@FindBy(xpath="//a[contains(text(),'Terms & Conditions.')]")
	private WebElement TermsCondition;
	@FindBy(xpath="//strong[contains(text(),'Email does not match')]")
	private WebElement InvalidEmailMsg;
	@FindBy(xpath="//strong[contains(text(),'Please enter a Valid Password')]")
	private WebElement InvalidPwdErrMsg;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getInvalidEmailMsg() {
		return InvalidEmailMsg;
	}
	public WebElement getInvalidPwdErrMsg() {
		return InvalidPwdErrMsg;
	}
	public void Login(String username, String password,WebDriver driver)  {
		EmailTxtBx.sendKeys(username);
		WaitStatementLib.implicitWaitForSeconds(driver, 10);
		PswTxtBx.sendKeys(password);
		TrmChkBx.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogInBtn.click();
	}
	public void ClickFblogin()  {
		TrmChkBx.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SocialLoginBtn.click();
	 }
	public void googleLogin()  {
		TrmChkBx.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MailLoginBtn.click();
	}
	
}
	


