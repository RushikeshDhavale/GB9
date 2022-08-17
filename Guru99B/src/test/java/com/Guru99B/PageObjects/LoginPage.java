package com.Guru99B.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@CacheLookup @FindBy(name="uid")  WebElement txtusername;
	@CacheLookup @FindBy(name="password")  WebElement txtpassword;
	@CacheLookup @FindBy(name="btnLogin")  WebElement submit;
	@CacheLookup @FindBy(name="btnReset")  WebElement reset;

	public void getusername(String username) 
	{
		txtusername.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		txtpassword.sendKeys(password);
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
