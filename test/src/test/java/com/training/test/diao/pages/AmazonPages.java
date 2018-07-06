package com.training.test.diao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	public WebDriver WebDriver;
	//departments button
	@FindBy(xpath="//*[@id=\"nav-link-shopall\"]")
	public WebElement departmentsSpan;
	//Appstore for Android
	@FindBy(xpath="//div[@id='nav-flyout-shopAll']/div[2]/span[3]/span")
	public WebElement AppstoreSpan;
	//Game
	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[3]/div[3]/div/a[2]/span[1]")
	public WebElement GameSpan;
	
	//game's name;
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div/div/div[2]/div/ol/li[1]/div[1]/a/span")
	public WebElement GameName;
	//add to list
	@FindBy(name="submit.add-to-registry.wishlist")
	public WebElement AddToList;
	
	//Continue button
	@FindBy(xpath="//*[@id=\"continue\"]")
	public WebElement ContinueBtn;
//	public WebElement continue;//不能使用这个的原因是continue是Java关键字所以只有重新命名
	
	//"Enter your email or mobile phone number"   msg
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/div/div/div")
	public WebElement ErrMsg;
	
	public AmazonPages(WebDriver webDriver) {
	PageFactory.initElements(webDriver, this);
}
	
}
