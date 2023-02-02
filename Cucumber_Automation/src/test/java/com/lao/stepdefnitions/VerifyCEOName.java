package com.lao.stepdefnitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Constants.Constantss;
import com.Page_Objects.HomePage;
import com.Page_Objects.Login_Page;
import com.Webdriver_manager.Driver_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEOName {
	private static final Logger LOGGER = LogManager.getLogger(VerifyCEOName.class);

	@Given("the user is logged in successfully and is on Homepage")
	public void the_user_is_logged_in_successfully_and_is_on_homepage() throws InterruptedException {
		Driver_Manager.getDriver().get(Constantss.App_URL);
		Thread.sleep(3000);

		Login_Page.getInstance().enterUserName(Constantss.UserName);
		Login_Page.getInstance().enterPassword(Constantss.Password);
		Login_Page.getInstance().clickLoginBtn();
	}

	@When("the user clicks on the directory option from the menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {

		HomePage.getInstance().clickDirectoryLink();
		LOGGER.info("the user clicks on the directory option from the menu bar");
	}

}
