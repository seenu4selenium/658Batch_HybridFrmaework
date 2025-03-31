package com.objectrepository;

import org.openqa.selenium.By;

public class QA_Locators {

	public final By searchbox_editbox = By.id("search_product");
	public final By search_icon = By.id("submit_search");
	public final By viewproduct_white = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a");
	public final By addtocart_1 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
	public final By continuebutton = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
	public final By viewproduct_green = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
	public final By addtocart_2 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
	public final By Viewcart = By.linkText("View Cart");
	public final By proceedtocheckout = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
	public final By rigisterorlogin = By.partialLinkText("Register / Login");
	public final By username = By.name("email");
	public final By password = By.name("password");
	
	
//AUTO TEST DATA
	
	public final By ATDphonenumberuncheck = By.className("checked-box");
	public final By ATDselectdatatype = By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[2]/div/button/div/div/div");
	public final By ATDaddText = By.className("text");
	public final By ATDpostalcode = By.xpath("//*[@id=\"bs-select-6-6\"]/span");
	public final By ATDaddbutton = By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[3]");
	public final By ATDEXCELradiobutton = By.xpath("//*[@id=\"exampleRadios10\"]");
	public final By ATDnumberofrowseditbox = By.id("total-rows-gen");
	public final By ATDclickongeneratebutton = By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div");
	public final By ATDclickondownloadbutton = By.xpath("/html/body/div[1]/div[1]/div[5]/button");
	
	//APW website
	
	public final By APWisopenedornot = By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	public final By APWconsent = By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]/p");
	public final By APWsignuobutton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	public final By APWusername = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
	public final By APWemail = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");	
	public final By APWsignupbuttonclick = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	
	
	

}
