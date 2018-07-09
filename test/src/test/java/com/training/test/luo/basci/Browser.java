package com.training.test.luo.basci;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	private static WebDriver my_driver;
	
	public static WebDriver myDriver() {
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		my_driver = new FirefoxDriver();
		
		my_driver.manage().window().maximize();
		my_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return my_driver;
	}
}
