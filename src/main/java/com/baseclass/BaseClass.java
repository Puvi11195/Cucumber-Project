package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static String value;
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"\\Driver\\geckodriver.exe");

			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void ClickOnElement(WebElement element) {
		element.click();

	}
	public static void inputValueElement(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void close() {
		driver.close();

	}
	public static void implicitWait(int seconds,TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);

	}
	public static void sleep(int  seconds) throws Throwable {
		Thread.sleep(seconds);

	}
	public static void explicitWait(int seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	public static void scrollUpAndDown(WebElement element) {
		try {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView;", element);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public static void dropDown(String type,WebElement element,String data) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int value = Integer.parseInt(data);
			s.selectByIndex(value);

		}else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(data);

		}else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(data);

		}



	}
	public static String particular_Data(String path, int row_Index, int cell_Index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();

		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int val = (int) numericCellValue;
			value =String.valueOf(val);


		}
		return value;

	}
	//Select by index
	
	public static void selectByIndex(WebElement element,int Index) {
		Select s =new Select(element);
		s.selectByIndex(Index);

}
	//select by value
	
	public static void selectByValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
}
//select  by visible text
	
	public static void selectByVisibleText(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	public void takesScreenshot(String path) throws IOException {
		 TakesScreenshot scrfle= (TakesScreenshot) driver;
			File scr = scrfle.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
		    FileUtils.copyFile(scr, dest);
		

	}
}




