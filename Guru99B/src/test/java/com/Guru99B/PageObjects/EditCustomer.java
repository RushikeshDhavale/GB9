package com.Guru99B.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {

	WebDriver ldriver;
	public EditCustomer(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, EditCustomer.class);
}
	@CacheLookup @FindBy(xpath="/html/body/div[3]/div/ul/li[3]/a")  WebElement linkeditcust;
	@CacheLookup @FindBy(name="cusid")  WebElement txtuserid;
	@CacheLookup @FindBy(name="AccSubmit")  WebElement submit;
	@CacheLookup @FindBy(name="res")  WebElement reset;
	
	public void getuserid(String userid)
	{
		txtuserid.sendKeys(userid);
	}
	
	public void clicksubmit()
	{
		submit.click();
	}
	
	public void clickreset()
	{
		reset.click();
	}
	
	public void clickeditcust()
	{
		linkeditcust.click();
	}
	
}