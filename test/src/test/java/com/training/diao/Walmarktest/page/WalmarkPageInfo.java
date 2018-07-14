package com.training.diao.Walmarktest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalmarkPageInfo {
	/*
	 * 在Walmark商城里面搜索指定商品 添加到购物车
	 * 
	 */
	
	//搜索框
	@FindBy(xpath="//*[@id=\"global-search-input\"]")
	public WebElement searchInput;
	
	//搜索按钮
	@FindBy(xpath="//*[@id=\"global-search-form\"]/div/div[3]/div/button")
	public WebElement seachButton;
	
	//搜索结果商品页面文字核对
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div/section/div[3]/div/div/div[4]/div[2]/div[2]/ul/li[1]/div/div[2]/div[5]/div/span[2]/a/span")
	public WebElement resultText;
	
	//添加购物车            
	@FindBy(xpath="//*[@class=\"button prod-ProductCTA--primary group1\"]")
	public WebElement addToCart;
	
	//查看购物车
	@FindBy(xpath="//*[@class=\"cart-pos-view-cart\"]/button")
	public WebElement viewCart;
	
	//结算
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/button[1]")
	public WebElement checkOut;
	
	//登录
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[1]/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/section/div/section/form/div[5]/button")
	public WebElement signIn;
	
	public WalmarkPageInfo (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
