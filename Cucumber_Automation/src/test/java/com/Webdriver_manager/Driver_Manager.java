package com.Webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Constants.Constantss;
import com.lao.stepdefnitions.Common_Step_Def;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Manager {
	
	private static WebDriver driver=null;
	private static final Logger LOGGER=LogManager.getLogger(Driver_Manager.class);

	public static void launchBrowser() {

		try {
			switch (Constantss.Browser) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching the chrome browser");
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				 driver = new FirefoxDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}

	public static WebDriver getDriver() {
		return driver;
	}

}
