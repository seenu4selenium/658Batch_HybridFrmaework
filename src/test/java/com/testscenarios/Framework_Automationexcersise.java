package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.QA_Locators;

public class Framework_Automationexcersise {

	QA_Locators Loc = new QA_Locators();

	@Test

	public void practiceautomation() throws InterruptedException {

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://automationexercise.com/products");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]/p")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(Loc.searchbox_editbox).sendKeys("tshirt");
		driver.findElement(Loc.search_icon).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "800");

		driver.findElement(Loc.viewproduct_white).click();
		driver.findElement(Loc.addtocart_1).click();
		driver.findElement(Loc.continuebutton).click();
		driver.navigate().back();
		driver.findElement(Loc.viewproduct_green).click();
		driver.findElement(Loc.addtocart_2).click();
		Thread.sleep(1000);
		driver.findElement(Loc.Viewcart).click();
		Thread.sleep(2000);
		driver.findElement(Loc.proceedtocheckout).click();
		Thread.sleep(1000);
		driver.findElement(Loc.rigisterorlogin).click();
		driver.findElement(Loc.username).sendKeys("Anusha");
		driver.findElement(Loc.password).sendKeys("Anusha123");
		// driver.findElement(Loc.clickonlogin);

	}
}

//	@AfterTest
//	public void screenshotAfterAtTestAnnotation() throws IOException {
//		TakesScreenshot driver = null;
//		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(abc, new File(".\\screenshots\\test.png"));
