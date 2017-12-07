package com.weafrican.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Devesh
 *
 */

public abstract class Basepage {
	@FindBy(xpath="//i[@title='Home']")
	private WebElement Home;
	@FindBy(linkText="About Us")
	private WebElement AboutUs;
	@FindBy(xpath="//a[contains(text(),'Services')]")
	private WebElement Services;
	@FindBy(xpath="//a[contains(text(),'Events')]")
	private WebElement Events;
	@FindBy(linkText="Subscription Plans")
	private WebElement SubscriptionPlans;
	@FindBy(xpath="//a[contains(@href,'https://www.weafricans.com/business-premium-membership-plans')]")
	private WebElement PremiumPlan;
	@FindBy(xpath="//a[contains(@href,'https://www.weafricans.com/banner-sponsorship-package')]")
	private WebElement SponcerBannerPackage;
	@FindBy(xpath="//a[contains(@href,'https://www.weafricans.com/business-ads-packages')]")
	private WebElement BusinessAdsPackage;
	@FindBy(linkText="Event Ads Package")
	private WebElement EventAdsPackage;
	@FindBy(linkText="https://www.weafricans.com/contact")
	private WebElement ContactUs;
	public Basepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnHome() {
		Home.click();
	}
	public void clickOnAboutUs() {
		AboutUs.click();;
	}
	public void clickOnServices() {
		Services.click();
	}
	public void clickOnPremiumPlan(WebDriver driver) {
		Actions act= new Actions(driver);
		act.moveToElement(SubscriptionPlans).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act.moveToElement(PremiumPlan).click().perform();
	}
	public void ClickOnSponcerBanner(WebDriver driver) {
		Actions act = new Actions (driver);
		act.moveToElement(SubscriptionPlans).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act.moveToElement(SponcerBannerPackage).click().perform();
	}
	public void ClickOnBusinessAdsPackage(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(SubscriptionPlans).perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		act.moveToElement(BusinessAdsPackage).click().perform();
	}
	public void ClickOnEventsAdsPackage(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(SubscriptionPlans).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act.moveToElement(EventAdsPackage).click().perform();
	}
	public void clickOnContactUs() {
		ContactUs.click();
	}
	

}
