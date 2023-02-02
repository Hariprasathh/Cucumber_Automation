package com.lao.stepdefnitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CommonUtilities.CommonUtils;
import com.Constants.Constantss;
import com.Webdriver_manager.Driver_Manager;

import io.cucumber.java.Before;

public class Common_Step_Def {

	// launch browser

	public static WebDriver driver;
	
	private static final Logger LOGGER=LogManager.getLogger(Common_Step_Def.class);
	
	@Before
	public void beforeScenario() {
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Instantiation the Common Utils");
			CommonUtils commonutils=new CommonUtils();
			LOGGER.info("Loading the properties file");
			commonutils.loadProperties();
			LOGGER.info("Checking the driver is NULL or Not");
			if(Driver_Manager.getDriver()==null) {
				Driver_Manager.launchBrowser();
				CommonUtils.initWebElements();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	}


