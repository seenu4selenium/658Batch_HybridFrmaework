package com.objectrepository;

import org.openqa.selenium.By;
//Here QA will store Application locators
public class QA_Locators {
	// PageName_ElementName_TypeOfElement
	public final By fbLoginPage_Email_Editbox = By.id("email");
	public final By fbLoginPage_Password_Editbox = By.name("pass");
	public final By fbLoginPage_Login_Button = By.name("login");	
	public final By products_Search_Editbox = By.name("search");
	
	
	//autotestdata locators
	public final By atd_numberRange_checkbox = By.xpath("//*[@id=\"property-table\"]/div[6]/div[1]/div/img[1]");
	public final By atd_Excel_RadioButton = By.id("exampleRadios10");
	public final By atd_numberofrows_Editbox = By.id("total-rows-gen");
	public final By atd_generate_button = By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div");
	public final By atd_download_button = By.xpath("/html/body/div[1]/div[1]/div[5]/button");

	public final By atd_nameOption_dropdown = By.xpath("//*[@id='property-table']/div[2]/div[4]/div/select");
	
	public final By dob_dropdown = By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select");
	
	//TestCase3_LoginUserWithIncorrectEmailAndPassword locators
	 public final By TC3_Home=By.linkText(" Home");
	 public final By TC3_SignUp = By.xpath(" //*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	 public final By TC3_LoginToYourAccount= By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/h2");
	 public final By TC3_WrongEmail= By.name("email");
	 public final By TC3_WrongPassword= By.name("password");
	 public final By TC3_LoginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button");
	 public final By TC3_VerifyEmailMessage=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/p");
	 public final By TC3_ErrorMessage = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");
	 
	 // CWL locators
	// 4. Prepare the xpath for All hyperlinks
	 //5. Prepare the xpath for All dropdowns
	// 6. Prepare the xpath for All buttons
	 public final By allEditboxes = By.xpath("//*[@type = 'text']");
	 public final By allCheckboxes = By.xpath("//*[@type = 'checkbox']");
	 public final By allRadiobuttons = By.xpath("//*[@type='radio']");
	 public final By allHyperlinks = By.xpath("//a");
	 public final By allDropdowns = By.xpath("//select");
	 public final By allButtons = By.xpath("//button");
	 public final By allPasswordEditBoxes = By.xpath("//*[@type='password']");
	 
	 
	 
	 
}

