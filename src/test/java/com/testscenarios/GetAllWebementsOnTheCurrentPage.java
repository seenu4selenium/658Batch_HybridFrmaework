package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.Commonfunctions;
import com.objectrepository.QA_Locators;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class GetAllWebementsOnTheCurrentPage extends Commonfunctions {
	@BeforeClass
	  public void beforeClass() throws Exception  {
		launchChromeBrowser();
		getURL("CW_URL");
	  }
  @AfterMethod
  public void afterMethod() throws Exception  {
	  takescreenshot("GetAllWebementsOnTheCurrentPage");
  }

  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  @Test
  public void f() throws Exception {
	 
	List<WebElement> alleditboxescount =driver.findElements(allEditboxes);
	 System.out.println("Edit boxes count is :" + alleditboxescount.size());
	 
	List<WebElement> allcheckboxescount =driver.findElements(allCheckboxes);
	 
	 System.out.println("Check boxes count is :"+allcheckboxescount.size());
	  List<WebElement> allradiobuttonscount = driver.findElements(allRadiobuttons);
	  System.out.println("Radio buttons count is :"+allradiobuttonscount.size());
	  
	List<WebElement>alldropdownscount = driver.findElements(allDropdowns);
	  System.out.println("Dropdowns count is :"+alldropdownscount.size());
	  
	List<WebElement>allhyperlinkcount = driver.findElements(allHyperlinks);
	  System.out.println("allhyperlinks count is :"+allhyperlinkcount.size());
	  
	List<WebElement>allpasswordeditboxcount = driver.findElements(allPasswordEditBoxes);
	  System.out.println("password editboxes count is :"+allpasswordeditboxcount.size());
	  long totalwebelements = alleditboxescount.size()+allcheckboxescount.size()+allradiobuttonscount.size()+
			  alldropdownscount.size()+allhyperlinkcount.size()+allpasswordeditboxcount.size();
	  System.out.println("*************************************************************");
	  System.out.println("Total elements count is :"+totalwebelements);
	  System.out.println("********************************************************************");
	 
  }
  

}
