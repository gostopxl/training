package com.training.test.xiao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
	public WebDriver driver;
	
	//
	public WebElement firstName;
	
	//
	public WebElement lastName;
	
	//
	@FindBy (id="country")
	public WebElement countryDroplist;
	
	//Submit button at the bottom
	@FindBy (xpath="/html/body/div[1]/div[2]/div[2]/form/button[1]")
	public WebElement submitBtn;
	
	//Your username is required. error message
	@FindBy (xpath="//div[2]/div/div[2]")
	public WebElement errMsg1;
	
    //Constructor
    public TestPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
