package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	@FindBy(id="first_name")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(id="last_name")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(id="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	@FindBy(id="cc_num")
	private WebElement ccNum;

	public WebElement getCcNum() {
		return ccNum;
	}
	@FindBy(id="cc_type")
	private WebElement type;

	public WebElement getType() {
		return type;
	}
	@FindBy(id="cc_exp_month")
	private WebElement exp;

	public WebElement getExp() {
		return exp;
	}
	@FindBy(id="cc_exp_year")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	@FindBy(id="cc_cvv")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	@FindBy(id="book_now")
	private WebElement finalSubmit;
	private WebDriver driver;

	public WebElement getFinalSubmit() {
		return finalSubmit;
	}
	public BookHotelPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}


}


