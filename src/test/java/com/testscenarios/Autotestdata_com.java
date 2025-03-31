package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectrepository.QA_Locators;

public class Autotestdata_com {

	WebDriver driver;

	@Test

	public void f() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		QA_Locators Loc = new QA_Locators();
		Properties P = new Properties();
		FileInputStream FI = new FileInputStream(".\\src\\test\\resources\\TestData\\QA_Testdata.properties");
		P.load(FI);
		driver.get(P.getProperty("ATD_URL"));
		Thread.sleep(2000);

		driver.findElement(Loc.ATDphonenumberuncheck).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "400");
        Thread.sleep(3000);
        driver.findElement(Loc.ATDselectdatatype).click();
        driver.findElement(Loc.ATDpostalcode).click();
		//driver.findElement(Loc.ATDaddText).click();
		driver.findElement(Loc.ATDaddbutton).click();
		driver.findElement(Loc.ATDEXCELradiobutton).click();
		driver.findElement(Loc.ATDnumberofrowseditbox).clear();
		Thread.sleep(2000);
		driver.findElement(Loc.ATDnumberofrowseditbox).sendKeys(P.getProperty("ATD_Numberofrows"));
		driver.findElement(Loc.ATDclickongeneratebutton).click();
		Thread.sleep(5000);
		driver.findElement(Loc.ATDclickondownloadbutton).click();
		
		

	}
}
