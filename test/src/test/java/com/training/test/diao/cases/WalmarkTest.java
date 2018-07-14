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
		driver.get("https://www.walmart.com/"); // TT: 地址这种东西最好不要写在test里面，跟页面元素一样的处理
		WalmarkPage wPage = new WalmarkPage(driver);  // TT: 页面初始化用PageFactory.initElements(driver, wPage.class); 放在befroe里面
		Actions actions = new Actions(driver);
		
		wPage.Btn.click();
		Thread.sleep(1000);
		actions.moveToElement(wPage.MMB).perform(); 
		/* TT: action可以用？我这里反正是没有反应的，都没有挪过去
		 * Action action = builder.moveToElement(element).build();
		 * action.perform();
		*/
		Thread.sleep(1000);
		actions.moveToElement(wPage.TVShow).perform();
		
		wPage.TVShow.click();
		Thread.sleep(2000);//由于网速原因所以加上了显示等待
		assertEquals("Roseanne: The Complete Series (DVD)",wPage.CommodityName.getText().trim());
		/* TT: 如果是getText的话，要先定义一个变量，然后在去assert，而不是一边assert一边去获取值
		 * 如果是页面字段验证的话也可以用
		 * assertTrue(driver.getPageSource().contains("***"));
		 */
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
		/* TT: 为了防止浏览器没有关掉，所以要加上
		 * WindowsUtils.killByName("geckodriver.exe");
		 */
	}

}
