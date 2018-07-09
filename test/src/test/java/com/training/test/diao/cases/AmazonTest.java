package com.training.test.diao.cases;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.training.test.diao.basic.Browsers;
import com.training.test.diao.pages.AmazonPages;

/**
 * Unit test for simple App.
 */
public class AmazonTest{
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = Browsers.wDriver();
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		//open the web page
		driver.get("https://www.amazon.com/");
		//Initialize the page object
		AmazonPages AP = new AmazonPages(driver);
		//Initialize the actions object
		Actions action = new Actions(driver);	
		//Mouse mobile hovering
		action.moveToElement(AP.departmentsSpan).perform();
		//sleep
		Thread.sleep(2000);
		AP.AppstoreSpan.click();
		action.moveToElement(AP.AppstoreSpan).perform();		
		Thread.sleep(2000);
		AP.GameSpan.click();		
	
		assertEquals("Minecraft", AP.GameName.getText());		
		AP.GameName.click();
		AP.AddToList.click();
		AP.ContinueBtn.click();
		assertEquals("Enter your email or mobile phone number", AP.ErrMsg.getText().trim());
	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	
	}

}
