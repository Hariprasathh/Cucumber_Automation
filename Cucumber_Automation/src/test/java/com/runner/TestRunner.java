package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="com.lao.stepdefnitions",
		dryRun = false,
		monochrome = true
		)

public class TestRunner {
	//System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
}
