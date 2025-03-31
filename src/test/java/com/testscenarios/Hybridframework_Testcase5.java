package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectrepository.QA_Locators;
import com.utilities.Commonfunctions;

public class Hybridframework_Testcase5 extends Commonfunctions {

	@Test

	public void rigisteruserwithexistingemail() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		QA_Locators Loc = new QA_Locators();
		Properties P = new Properties();
		FileInputStream FI = new FileInputStream(".\\src\\test\\resources\\TestData\\QA_Testdata.properties");
		P.load(FI);
		driver.get(P.getProperty("APW_URL"));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(Loc.APWconsent).click();
		Thread.sleep(1000);
		WebElement Logo = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
		boolean flag = Logo.isDisplayed();
		System.out.println("Logo element is displayed: " + flag);
		driver.findElement(Loc.APWsignuobutton).click();

		WebElement signupVerify = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		boolean verify = signupVerify.isDisplayed();
		System.out.println("newuser signup element is displayed: " + verify);
		driver.findElement(Loc.APWusername).sendKeys(P.getProperty("APW_Username"));
		driver.findElement(Loc.APWemail).sendKeys(P.getProperty("APW_Emailid"));
		driver.findElement(Loc.APWsignupbuttonclick).click();

		String actualMsg = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p")).getText();
		String errorMsg = "Invalid username or password";

		if (actualMsg.equals("Email Address already exist!")) {
			System.out.println("Test Case Passed");
			System.out.println("Error message validation working");
		} else {
			System.out.println("Test Case Failed");
			System.out.println("Error message validation not working");

		}

		driver.close();

	}

}
