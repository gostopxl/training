package com.training.test.xiao.basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	private static WebDriver my_driver;

	public static WebDriver myDriver() {

		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		my_driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//my_driver = new ChromeDriver();	
		
		my_driver.manage().window().maximize();
		my_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return my_driver;
}
}