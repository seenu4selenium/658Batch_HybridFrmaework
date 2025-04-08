package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetDataFromExcelSheet_Ven {
	
	
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\testtd.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("FacebookLogin");
		Row r = s.getRow(1);
		Cell username = r.getCell(0);
		Cell password = r.getCell(1);

//		System.out.println(c.getStringCellValue());
//		System.out.println(c1.getStringCellValue());
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Title of the page is: "+driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys(username.getStringCellValue());
		driver.findElement(By.name("pass")).sendKeys(password.getStringCellValue());
		
			
	}
}
