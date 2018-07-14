package com.training.diao.Walmarktest.cases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.os.WindowsUtils;

import com.training.diao.Walmarktest.global.WalmarkImpl;
import com.training.diao.Walmarktest.page.WalmarkPageInfo;
import com.training.diao.Walmarktest.util.Browsers;
import com.training.diao.Walmarktest.util.network_address;

public class WalmarkSearchAddToCart{
	private WebDriver driver;
	private WalmarkPageInfo wPageInfo;//页面元素
	@Before
	public void setUp() throws Exception {
		driver = Browsers.wDriver();//加载驱动初始化浏览器
		network_address.Address(driver);//获取链接
		wPageInfo = new WalmarkPageInfo(driver);//实例化页面元素
//		PageFactory.initElements(driver, WalmarkPageInfo.class);//实例化页面元素
	}
	
	@Test
	public void seachToCart() throws Exception{
		wPageInfo.searchInput.sendKeys(WalmarkImpl.searchText);
		wPageInfo.seachButton.click();
		Thread.sleep(3000);
		assertEquals(WalmarkImpl.resultText,wPageInfo.resultText.getText().trim());
		wPageInfo.resultText.click();
		wPageInfo.addToCart.click();
		wPageInfo.viewCart.click();
		Thread.sleep(2000);
		wPageInfo.checkOut.click();
		wPageInfo.signIn.click();
	}
	@After
	public void endTest()throws Exception{
		driver.quit();
		WindowsUtils.killByName("geckodriver.exe");
	}
}

