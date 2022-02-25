package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	
		
		@FindBy(id="location")
		private WebElement location;

		public WebElement getLocation() {
			return location;
		}
		
		public SearchHotelPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(id="hotels")
		private WebElement hotel;

		public WebElement getHotel() {
			return hotel;
		}
		@FindBy(id="room_type")
		private WebElement room;

		public WebElement getRoom() {
			return room;
		}
		@FindBy(id="room_nos")
		private WebElement roomNos;

		public WebElement getRoomNos() {
			return roomNos;
		}
		@FindBy(id="datepick_in")
		private WebElement checkIn;

		public WebElement getCheckIn() {
			return checkIn;
		}
		@FindBy(id="datepick_out")
		private WebElement checkOut;

		public WebElement getCheckOut() {
			return checkOut;
		}
		@FindBy(id="adult_room")
		private WebElement adultRoom;

		public WebElement getAdultRoom() {
			return adultRoom;
		}
		@FindBy(id="Submit")
		private WebElement submit;
		private WebDriver driver;

		public WebElement getSubmit() {
			return submit;
		}
		
		
		

	}


