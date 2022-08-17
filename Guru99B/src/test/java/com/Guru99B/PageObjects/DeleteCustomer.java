package com.Guru99B.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer {

	WebDriver ldriver;
	public DeleteCustomer(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, DeleteCustomer.class);
}
	
	@CacheLookup @FindBy(xpath="/html/body/div[3]/div/ul/li[4]/a")  WebElement linkdeletecust;
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
}
