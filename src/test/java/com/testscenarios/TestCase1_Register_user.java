package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.Commonfunctions;

public class TestCase1_Register_user extends Commonfunctions {
	
	
	@BeforeClass
	public void beforeClass() throws Exception {
		launchChromeBrowser();
		getURL("AE_URL");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		}
	
	
  @Test
  public void f() throws Exception {
	  waitForElementToBevisibilityOf(loc.homepage_element_button, 10);
	  driver.findElement(loc.signup_button).click();
	  waitForElementToBevisibilityOf(loc.signup_button_for_verification, 10);
	  sendKeysByAnyLocator(loc.Name_field, "AE_NAME");
	  sendKeysByAnyLocator(loc.Username_field, "AE_EMAIL");
	  driver.findElement(loc.signup_button_for_verification).click();
	  
	  
	  
  }
}


 