package com.runner;

import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\features\\Adactin.features",
glue="com.stepdefinition",
monochrome = true,
strict = true,
plugin= {
		"html:Report/Html_Report",
		"json:Report/Report.json",
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html"})




public class TestRunner {

	public static WebDriver driver;//null
	@BeforeClass
	public static void set_Up() {
		driver=BaseClass.getBrowser("chrome");

	}
	@AfterClass
	public static void tear_Down() {

		driver.close();
		


	}

}
