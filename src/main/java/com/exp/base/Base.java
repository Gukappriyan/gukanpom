package com.exp.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization(){
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

}
