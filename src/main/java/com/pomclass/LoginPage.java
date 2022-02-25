package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
private WebDriver driver;
	
	@FindBy(id="username")
	private WebElement userName;
	

	public WebElement getUserName() {
		return userName;
	}
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="login")
	private WebElement submitLogin;

	
	public WebElement getSubmitLogin() {
		return submitLogin;
	}

}

	


