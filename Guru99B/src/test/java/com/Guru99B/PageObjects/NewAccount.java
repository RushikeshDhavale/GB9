package com.Guru99B.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {
	WebDriver ldriver;
	public NewAccount(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, NewAccount.class);
	}
	
	@CacheLookup @FindBy(xpath="html/body/div[3]/div/ul/li[5]/a") WebElement linknewaccount;
	@CacheLookup @FindBy(name="cusid") WebElement custid;
	@CacheLookup @FindBy(name="inideposit") WebElement initDeposit;
	@CacheLookup @FindBy(name="button2") WebElement submit;
	@CacheLookup @FindBy(name="reset") WebElement reset;
	@CacheLookup @FindBy(name="selaccount") WebElement AccType;
	
	
	public void clickNewAccount()
	{
		linknewaccount.click();
	}
	
	 public void getcustomerID(String cid)
	 {
		 custid.sendKeys(cid);
	 }
	 
		public void selectAccountType(int i) {
			
			Select AT=new Select(AccType);
			AT.selectByIndex(i);
		}
		
	 public void getinitDeposit(String initialDeposit)
	 {
		 initDeposit.sendKeys(initialDeposit);
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
