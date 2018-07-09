package com.training.test.diao.cases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.training.test.diao.basic.Browsers;
import com.training.test.diao.pages.WalmarkPage;

public class WalmarkTest {
	private WebDriver driver;
	@Before
	public void init() throws Exception{
		driver = Browsers.wDriver();
	}
	
	@Test
	public void WkTest() throws Exception{
		driver.get("https://www.walmart.com/");
		WalmarkPage wPage = new WalmarkPage(driver);
		Actions actions = new Actions(driver);
		
		wPage.Btn.click();
		Thread.sleep(1000);
		actions.moveToElement(wPage.MMB).perform();
		Thread.sleep(1000);
		actions.moveToElement(wPage.TVShow).perform();
		
		wPage.TVShow.click();
		Thread.sleep(2000);//由于网速原因所以加上了显示等待
		assertEquals("Roseanne: The Complete Series (DVD)",wPage.CommodityName.getText().trim());
		 wPage.CommodityName.click();	
		 Thread.sleep(2000);
		 wPage.AddToCart.click();		 
		 wPage.ViewCart.click();
		 Thread.sleep(2000);
		 wPage.CheckOut.click();
		 Thread.sleep(2000);
		 wPage.SignIn.click();		 
		 assertEquals("ErrorEmail address is required.", wPage.errmsg1.getText().trim());		 
		 assertEquals("Password is required.", wPage.errmsg2.getText());
	}
	@After
	public void endTest() throws Exception{
		driver.quit();
	}

}
