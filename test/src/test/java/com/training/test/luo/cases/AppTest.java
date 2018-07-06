package com.training.test.luo.cases;


import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import com.training.test.luo.basci.Browsers;
import com.training.test.luo.pages.TestPage1;

public class AppTest {
  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
    driver = Browsers.myDriver();
  }

  @Test
  public void testUntitledTestCase3() throws Exception {
    driver.get("https://www.walmart.com/");
    TestPage1 tp = new TestPage1(driver);
    Actions action = new Actions(driver);
    action.moveToElement(tp.clickBtn1).perform();
    Thread.sleep(2000);
    tp.clickBtn1.click();//点击目录
    action.moveToElement(tp.clickBtn2).perform();
    Thread.sleep(2000);
    tp.clickBtn2.click();//点击栏目
    action.moveToElement(tp.clickBtn3).perform();
    Thread.sleep(1000);
    tp.clickBtn3.click();//点击栏目
    Thread.sleep(3000);
    tp.clickImg.click();//点击图片
    Thread.sleep(2000);
    tp.clickBtn4.click();
    tp.submitBtn.click();
    
//    assertEquals("Email address is required.", driver.findElement(By.xpath("//span[2]")).getText());
    assertEquals("Email address is required.", tp.errMgs.getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
  }
}
