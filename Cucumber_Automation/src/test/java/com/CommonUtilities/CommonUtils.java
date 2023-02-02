package com.CommonUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.support.PageFactory;

import com.Constants.Constantss;

import com.Page_Objects.HomePage;
import com.Page_Objects.Login_Page;
import com.Webdriver_manager.Driver_Manager;

public class CommonUtils {

	public void loadProperties() {
		FileReader reader = null;

		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/Config.properties"));
		} catch (Exception e) {
			// TODO: handle exception
		}

		Constantss.App_URL = properties.getProperty("App_URL");
		Constantss.Browser = properties.getProperty("Browser");
		Constantss.UserName = properties.getProperty("UserName");
		Constantss.Password = properties.getProperty("Password");
		Constantss.Chrome_Driver_Location = properties.getProperty("Chrome_Driver_Location");

	}

	public static void initWebElements() {
		PageFactory.initElements(Driver_Manager.getDriver(), Login_Page.getInstance());
		PageFactory.initElements(Driver_Manager.getDriver(), HomePage.getInstance());
	

	}
}
