package com.training.test.diao.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	private static WebDriver webDriver;
	public static WebDriver wDriver() {
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		webDriver = new FirefoxDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return webDriver;
	}
}
