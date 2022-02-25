package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
public static Properties p;
	
	public ConfigurationReader() throws Throwable  {
		
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_project\\src\\main\\java\\com\\configuration\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 p= new Properties();//null
		p.load(fis);
		
	}
	
	
	
	public String getURLData()  {
		
		
		String url = p.getProperty("url");
		return url;

	}
	
	public String getUserName()  {
		
		
		String userName = p.getProperty("userName");
		return userName;

	}
	
	public String getPassword()  {
		
		
		
		String password = p.getProperty("password");
		
		return password;
		
		
	}
	public String getFirstName() {
		
		String firstName = p.getProperty("firstName");
		return firstName;

	}
	public String getlastName() {
		String lastName = p.getProperty("lastName");
		return lastName;
		
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;

	}
	
	public String getCardNumber() {
		String cardNumber = p.getProperty("cardNumber");
       return cardNumber;
	}
	
	public String getCCNumber() {
		String ccNumber = p.getProperty("ccNumber");
		return ccNumber;

	}
	

}



