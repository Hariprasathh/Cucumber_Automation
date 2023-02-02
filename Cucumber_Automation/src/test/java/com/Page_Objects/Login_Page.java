package com.Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {
	
	private static Login_Page LoginInstance;
	
	private Login_Page() {
		
	}
	
	public static Login_Page getInstance() {
	if(LoginInstance==null) {
		LoginInstance=new Login_Page();
	}
	return LoginInstance;	
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement UserName;
	

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement Password;
	

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement loginBtn;


	
	
	public void enterUserName(String name) {
		UserName.sendKeys(name);
		
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
		
	}
	public void clickLoginBtn() {
		loginBtn.click();
		
	}


}
