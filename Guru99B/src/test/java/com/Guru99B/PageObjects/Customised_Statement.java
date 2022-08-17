package com.Guru99B.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customised_Statement {

	WebDriver ldriver;
	
	public Customised_Statement(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(linkText="rdriver") WebElement CustomisedStatementlink;
	@FindBy(name="accountno") WebElement AccountNO;
	@FindBy(name="fdate") WebElement FromDate;
	
	
	
	
	
}
