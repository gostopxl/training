package com.training.test.luo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage1 {
	public WebDriver driver;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div/header/div/div[3]/div/div/div[1]/div/button")
	public WebElement clickBtn1;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[3]/button")
	public WebElement clickBtn2;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div/header/div/div[1]/div[2]/div/nav/div/div[2]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/div[3]/h4/a")
	public WebElement clickBtn3;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div/div[1]/div/section/div[2]/div/div/div[4]/div[2]/div[2]/ul/li[2]/div/div[2]/div[2]/div/div/a/img")
	public WebElement clickImg;
	
	@FindBy (xpath="/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div/div/div[4]/div[4]/div[2]/div/div/div/div/div[13]/div/div/div[1]/div/span[2]")
	public WebElement clickBtn4;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div[2]/div/section/form/div[5]/button")
	public WebElement submitBtn;
	
	@FindBy (xpath="/html/body/div[1]/div/div/div[2]/div/section/form/div[1]/div/label/div[1]/span[2]")
	public WebElement errMgs;
	
	public TestPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
