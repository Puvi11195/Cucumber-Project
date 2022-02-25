package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.FileReaderManager;
import com.pomclass.PageObjectManager;
import com.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition  extends BaseClass{
	
	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void before_Hooks(Scenario s) {
		String name = s.getName();
		System.out.println("Name:"+ name);
	}
		
    @After
	public void after_Hook(Scenario s) throws Throwable {
    	String status = s.getStatus();
    	System.out.println("Status"+ status);
    	
    	if (s.isFailed()) {
			takesScreenshot("C:\\Users\\hp\\eclipse-workspace\\AdactinCucumber\\Screenshot\\Cucumber.png");
		}
	
	}
   
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getURLData();
		getUrl(url);
	    
		
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	   inputValueElement(pom.getInstancelogin().getUserName(), username); 
		
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	inputValueElement(pom.getInstancelogin().getPassword(), password);	
	    
	}

	@Then("^user Click On Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		ClickOnElement(pom.getInstancelogin().getSubmitLogin());
	    
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
       selectByIndex(pom.getInstanceshp().getLocation(), 1);
	    
	}

	@When("^user Select The Hotel Type$")
	public void user_Select_The_Hotel_Type() throws Throwable {
		selectByIndex(pom.getInstanceshp().getHotel(), 2);
	    
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		selectByValue(pom.getInstanceshp().getRoom(), "Deluxe");
	    
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		selectByIndex(pom.getInstanceshp().getRoomNos(), 1);	
	    
	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		inputValueElement(pom.getInstanceshp().getCheckIn(), "17/02/2022");
	    
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		inputValueElement(pom.getInstanceshp().getCheckOut(), "21/02/2022");
	    
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		selectByIndex(pom.getInstanceshp().getAdultRoom(), 1);
	    
	}

	@Then("^user Click On Search Button It Will Navigate to Select Hotel Page$")
	public void user_Click_On_Search_Button_It_Will_Navigate_to_Select_Hotel_Page() throws Throwable {
		ClickOnElement(pom.getInstanceshp().getSubmit());
	    
	}

	@When("^user Select Select Button In Select Hotel Page$")
	public void user_Select_Select_Button_In_Select_Hotel_Page() throws Throwable {
		ClickOnElement(pom.getInstancecbp().getButtonClick());
	    
	}

	@Then("^user Click On Continue Button It Will Navigate To Book A Hotel Page$")
	public void user_Click_On_Continue_Button_It_Will_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		ClickOnElement(pom.getInstancecbp().getContinueClick());
	    
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		String firstName = FileReaderManager.getInstanceFRM().getInstanceCR().getFirstName();
		inputValueElement(pom.getInstancebookHotel().getLastName(), firstName);
	    
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		String lastName = FileReaderManager.getInstanceFRM().getInstanceCR().getlastName();
		inputValueElement(pom.getInstancebookHotel().getLastName(), lastName);
	    
	}

	@When("^user Enter The Billing Address In Address Field$")
	public void user_Enter_The_Billing_Address_In_Address_Field() throws Throwable {
		String address = FileReaderManager.getInstanceFRM().getInstanceCR().getAddress();
		inputValueElement(pom.getInstancebookHotel().getAddress(),address);
	    
	}

	@When("^user Enter Credit Card No In Field$")
	public void user_Enter_Credit_Card_No_In_Field() throws Throwable {
		String cardNumber = FileReaderManager.getInstanceFRM().getInstanceCR().getCardNumber();
		inputValueElement(pom.getInstancebookHotel().getCcNum(), cardNumber);

	   
	}

	@When("^user Select Credit Card Type$")
	public void user_Select_Credit_Card_Type() throws Throwable {
		selectByIndex(pom.getInstancebookHotel().getType(), 2);
	    
	}

	@When("^user Select Expiry Date$")
	public void user_Select_Expiry_Date() throws Throwable {
		selectByIndex(pom.getInstancebookHotel().getExp(), 5);

		selectByIndex(pom.getInstancebookHotel().getYear(), 5);
	    
	}

	@When("^user Select Cvv Number$")
	public void user_Select_Cvv_Number() throws Throwable {
		
		String ccNumber = FileReaderManager.getInstanceFRM().getInstanceCR().getCCNumber();
		inputValueElement(pom.getInstancebookHotel().getCvv(), ccNumber);
	    
	}

	

}
