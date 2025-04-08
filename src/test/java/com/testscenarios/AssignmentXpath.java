package com.testscenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AssignmentXpath {
	WebDriver driver;
	@Test
	public void f() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");

		driver.findElement(By.xpath("//select[@name = 'fromPort']")).click();
		driver.findElement(By.xpath("//option[@value ='Paris']")).isSelected();
		driver.findElement(By.xpath("//select[@name = 'toPort']")).click();
		driver.findElement(By.xpath("//option[@value ='London']")).isSelected();
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		driver.findElement(By.xpath("//input[@id ='inputName']")).sendKeys("hyd123");
		driver.findElement(By.xpath("//input[@id ='address']")).sendKeys("Scot123");
		driver.findElement(By.xpath("//input[@id ='city']")).sendKeys("Glass");
		driver.findElement(By.xpath("//input[@id ='state']")).sendKeys("Scot");
		driver.findElement(By.xpath("//input[@id ='zipCode']")).sendKeys("SC11");
		driver.findElement(By.xpath("//select[@name ='cardType']")).isSelected();
		driver.findElement(By.xpath("//option[@value ='amex']")).click();
		driver.findElement(By.xpath("//input[@id ='creditCardNumber']")).sendKeys("788732864354");
		driver.findElement(By.xpath("//input[@id ='creditCardMonth']")).clear();
		driver.findElement(By.xpath("//input[@id ='creditCardMonth']")).sendKeys("07");
		driver.findElement(By.xpath("//input[@id ='creditCardYear']")).clear();
		driver.findElement(By.xpath("//input[@id ='creditCardYear']")).sendKeys("2012");
		driver.findElement(By.xpath("//input[@id ='nameOnCard']")).sendKeys("Kkk hkdjskd");
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
	}
		@AfterTest
		  public void screenshot() throws IOException
		  {
		  File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  
		  FileHandler.copy(abc, new File(".\\screenshots\\test.png"));
		}
		
//		driver.quit();
	
}
