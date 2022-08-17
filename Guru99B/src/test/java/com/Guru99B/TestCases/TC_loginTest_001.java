package com.Guru99B.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Guru99B.PageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass {

	@Test
	public void LoginTest() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.getusername(username);
		logger.info("Entered Username");
		lp.setpassword(password);
		Thread.sleep(3000);
		logger.info("Entered password");
		lp.clicksubmit();
		logger.info("Clicked on Login");
		Thread.sleep(3000);
		
		/*if (isAlertPresent()==true)
		{
			logger.info("Entered incorrect username or password");
			logger.info("Login test failed");
			captureScreenshot(driver,"LoginTest");
			Assert.assertTrue(false);
		}*/
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Successfully Login");
			logger.info("Login test passed");
		}else
		{
			logger.info("Login test failed");
			captureScreenshot(driver,"LoginTest");
			Assert.assertTrue(false);
		}
	}	
	
}
