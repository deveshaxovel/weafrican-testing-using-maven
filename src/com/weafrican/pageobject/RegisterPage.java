package com.weafrican.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Devesh Kumar Rai
 *
 */

public class RegisterPage{
	@FindBy(linkText="Register Business")
	private WebElement RegisterBusiness;
	@FindBy(name="salutation")
	private WebElement SalutationDrpdwn;
	@FindBy(xpath="//option[@value='Mr']")
	private WebElement FstOpt;
	@FindBy(xpath="//option[@value='Ms']")
	private WebElement SecOpt;
	@FindBy(xpath="//option[@value='Mrs']")
	private WebElement ThrdOpt;
	@FindBy(name="first_name")
	private WebElement FstNameTxtBx;
	@FindBy(name="middle_name")
	private WebElement MidNameTxtBx;
	@FindBy(name="last_name")
	private WebElement LstNameTxtBx;
	@FindBy(xpath="//input[@value='male']")
	private WebElement GenderMaleBtn;
	@FindBy(xpath="//input[@value='female']")
	private WebElement GenderFemaleBtn;
	@FindBy(id="bussiness_category_id")
	private WebElement BusinessCatDrp;
	@FindBy(xpath="//option[contains(text(),'Entertainment')]")
	private WebElement EntertainmentBusCat;
	@FindBy(xpath="//option[contains(text(),'Skilled Professional')]")
	private WebElement SkilledProfBusCat;
	@FindBy(xpath="//option[contains(text(),'Category3')]")
	private WebElement Cat3BusCat;
	@FindBy(id="house")
	private WebElement HouseNumTxtBx;
	@FindBy(id="city")
	private WebElement CityTxtBx;
	@FindBy(name="mobile_number")
	private WebElement MblTxtBx;
	@FindBy(id="business_title")
	private WebElement BusNamTxtBx;
	@FindBy(xpath="//input[@id='business_keywords']")
	private WebElement BusKeyTxtBx;
	@FindBy(xpath="//input[@name='website']")
	private WebElement WebsiteTxtBx;
	@FindBy(xpath="//textarea[@name='about_us']")
	private WebElement AbtUsTxtBx;
	@FindBy(xpath="//label[@class='btn-bs-file btn btn-info']")
	private WebElement BusLogoBrwBtn;
	@FindBy(xpath="//select[@id='maritial_status']")
	private WebElement MartialStatusDrpDwn;
	@FindBy(xpath="//option[contains(text(),'Married')]")
	private WebElement MarStaDrpDwn1;
	@FindBy(xpath="//option[contains(text(),'Single')]")
	private WebElement MarStaDrpDwn2;
	@FindBy(xpath="//option[contains(text(),'Divorced')]")
	private WebElement MarStaDrpDwn3;
	@FindBy(xpath="//option[contains(text(),'Separated')]")
	private WebElement MarStaDrpDwn4;
	@FindBy(id="acedimic_status")
	private WebElement AcdStaDrpDwn;
	@FindBy(xpath="//option[@value='10']")
	private WebElement AcdStaDrpDwn1;
	@FindBy(xpath="//option[contains(text(),'10+2')]")
	private WebElement AcdStaDrpDwn2;
	@FindBy(xpath="//option[@value='Graduate']")
	private WebElement AcdStaDrpDwn3;
	@FindBy(xpath="//option[contains(text(),'Post Graduate')]")
	private WebElement AcdStaDrpDwn4;
	@FindBy(xpath="//option[contains(text(),'Diploma')]")
	private WebElement AcdStaDrpDwn5;
	@FindBy(id="occupation")
	private WebElement OccupationTxtBx;
	@FindBy(id="key_skills")
	private WebElement KeySklTxtBx;
	@FindBy(xpath="//input[@name='email']")
	private WebElement EmailTxtBx;
	@FindBy(xpath="//input[@id='password']")
	private WebElement PassTxtBx;
	@FindBy(name="confirm_password")
	private WebElement CnfrmPassTxtBtn;
	@FindBy(xpath="//select[@id='security_question_id']")
	private WebElement SecQueDrpDwn;
	@FindBy(xpath="//option[contains(text(),'What is the last name of the teacher who gave you your first failing grade?')]")
    private WebElement DrpDwnOpt1;
	@FindBy(xpath="//option[contains(text(),'What was the name of your elementary / primary school?')]")
	private WebElement DrpDwnopt2;
	@FindBy(xpath="//option[contains(text(),'In what city or town does your nearest sibling live?')]")
	private WebElement DrpDwnopt3;
	@FindBy(xpath="//option[contains(text(),'What time of the day were you born? (hh:mm)')]")
	private WebElement DrpDwnopt4;
	@FindBy(xpath="//option[contains(text(),'what is your pet name')]")
	private WebElement DrpDwnopt5;
	@FindBy(xpath="//option[contains(text(),'What is your childhood name')]")
	public WebElement DrpDwnopt6;
	@FindBy(xpath="//option[contains(text(),'what is pet name')]")
	private WebElement DrpDwnopt7;
	@FindBy(xpath="//option[contains(text(),'what is your first friend name')]")
	private WebElement DrpDwnopt8;
	@FindBy(id="security_question_ans")
	private WebElement SecQueAns;
	@FindBy(name="is_agree_to_terms")
	private WebElement AgreeTrmChkBx;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement SubmitBtn;
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
