package com.pomclass;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
	public WebDriver driver;//null

	private LoginPage login;//null

	//private className= obj Name
	private SearchHotelPage shp;

	private ContinueBoxPage cbp;

	private BookHotelPage bookHotel;

	

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}

	public LoginPage getInstancelogin() {
		if (login==null) {

			login = new LoginPage(driver);//object
		}
		return login;
	}
	
	public SearchHotelPage getInstanceshp() {
		if (shp==null) {
			shp= new SearchHotelPage(driver);

		}
		return shp;

	}
	
	public ContinueBoxPage getInstancecbp() {

		if (cbp==null) {
			cbp=new ContinueBoxPage(driver);

		}
		return cbp;
	}
	
	public BookHotelPage getInstancebookHotel() {
		if (bookHotel==null) {
			bookHotel =new BookHotelPage(driver);
		}
		return bookHotel;

	}
}
