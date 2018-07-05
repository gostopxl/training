package com.training.test.xiao.cases;

import static org.junit.Assert.*;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AppTest {
	private WebDriver driver;
//	private String baseUrl;
//	private boolean acceptNextAlert = true;
//	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
		driver = new FirefoxDriver();
//		baseUrl = "https://www.katalon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("https://getbootstrap.com/docs/4.1/examples/checkout/");
//		driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Alex");
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Xiao");
//		driver.findElement(By.id("country")).click();
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//select[@id='country']/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/form/button[1]")).click();
		Thread.sleep(2000);
//		assertEquals("Your username is required.", );
		assertEquals("Yourusername is required.", driver.findElement(By.xpath("//div[2]/div/div[2]")).getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
//		String verificationErrorString = verificationErrors.toString();
//		if (!"".equals(verificationErrorString)) {
//			fail(verificationErrorString);
//		}
	}

//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//
//	private boolean isAlertPresent() {
//		try {
//			driver.switchTo().alert();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}
//
//	private String closeAlertAndGetItsText() {
//		try {
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//			if (acceptNextAlert) {
//				alert.accept();
//			} else {
//				alert.dismiss();
//			}
//			return alertText;
//		} finally {
//			acceptNextAlert = true;
//		}
//	}
}
