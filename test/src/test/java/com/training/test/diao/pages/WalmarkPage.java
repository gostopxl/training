package com.training.test.diao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalmarkPage {
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/header/div/div[3]/div/div/div[1]/div/button")
	public WebElement Btn;
	//movies Music Book 
	@FindBy(xpath="/html/body/div/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[5]/button")
	public WebElement MMB;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[5]/div[1]/div[3]/div[2]/div[1]/div/a[6]")
	public WebElement TVShow;
	
	//Roseanne: The Complete Series (DVD)
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div/section/div[3]/div/div/div[4]/div[2]/div[2]/ul/li[1]/div/div[2]/div[5]/div/span[2]/a/span")
	public WebElement CommodityName;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div/div/div[4]/div[4]/div[2]/div/div/div/div/div[10]/div/div[1]/div[2]/button")
	public WebElement AddToCart;
	//view cart button
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[2]/div[1]/button")
	public WebElement ViewCart;
	//check out button
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/div/div[1]/div[2]/div/div/div[2]/div/div/button[1]")
	public WebElement CheckOut;
	//sign in button
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/section/div/section/form/div[5]/button")
	public WebElement SignIn;
	//ErrorEmail address is required.
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/section/div/section/form/div[1]/div/label/div[1]/span[2]")
	public WebElement errmsg1;
	//ErrorPassword is required.
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/section/div/section/form/div[2]/div/div[1]/label/div[1]/span[2]")
	public WebElement errmsg2;
	public WalmarkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
