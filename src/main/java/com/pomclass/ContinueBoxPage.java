package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueBoxPage {
	@FindBy(id="radiobutton_0")
	private WebElement buttonClick;

	public WebElement getButtonClick() {
		return buttonClick;
	}
	 @FindBy(id="continue")
	private WebElement continueClick;
	private WebDriver driver;

	public WebElement getContinueClick() {
		return continueClick;
	}
	public ContinueBoxPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}


