package com.testscenarios;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.objectrepository.QA_Locators;
import com.utilities.Commonfunctions;

public class TestCase3_LoginUserWithIncorrectEmailAndPassword extends Commonfunctions {
	
	

	@Test
	public void TestCase3() throws Exception  {
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QA_TestData.properties");
		p.load(fi);
		launchChromeBrowser();
		getURL("AT_URL");
		verifyWebElement(loc.TC3_Home);
		implicitWait(20);
		clickByAnyLocator(loc.TC3_SignUp);
		sendKeysByAnyLocator(loc.TC3_WrongEmail, "AT_Email");
		sendKeysByAnyLocator(loc.TC3_WrongPassword,"AT_Password");
	    clickByAnyLocator(loc.TC3_LoginButton);
	    verifyWebElement(loc.TC3_ErrorMessage);
		
		//driver.findElement(loc.TC3_SignUp).click();
		//driver.findElement(loc.TC3_WrongEmail).sendKeys(p.getProperty("AT_Email"));
		//driver.findElement(loc.TC3_WrongPassword).sendKeys(p.getProperty("AT_Password"));
		//driver.findElement(loc.TC3_LoginButton).click();
		
	 
			
		}
		
		
		
		
		
		
		
	}


