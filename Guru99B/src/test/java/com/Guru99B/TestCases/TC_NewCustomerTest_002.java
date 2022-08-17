package com.Guru99B.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Guru99B.PageObjects.LoginPage;
import com.Guru99B.PageObjects.NewCustomer;

public class TC_NewCustomerTest_002 extends BaseClass {

	@Test
	public void NewCustomerTest() throws InterruptedException, IOException, NoSuchElementException {
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		LoginPage lp=new LoginPage(driver);
		lp.getusername(username);
		logger.info("Entered Username");
		lp.setpassword(password);
		Thread.sleep(2000);
		logger.info("Entered password");
		lp.clicksubmit();
		logger.info("Clicked on Login");
		Thread.sleep(1000);
		
		logger.info("Switching to page new customer");
		NewCustomer NewCust=new NewCustomer(driver);
		NewCust.clickNewCustomer();
		logger.info("Clicked on new customer");
		Thread.sleep(2000);
		
		try {
		driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		logger.info("switched to frame1");
			WebElement ele=driver.findElement(By.cssSelector("svg[svg[viewBox='0 0 48 48']"));
		logger.info("The status of element is "+ele.isDisplayed());
		ele.click();
		logger.info("frame1 Ad closed");
		}catch(Exception e)
		{
		driver.switchTo().frame("ad_iframe");
		Thread.sleep(2000);
		logger.info("switched to frame2");
		driver.findElement(By.id("dismiss-button")).click();
		logger.info("frame2 ad closed");
		}
		driver.switchTo().defaultContent();
		logger.info("Reach to New Customer Page");
		
		Thread.sleep(3000);
		logger.info("providing customer details....");
		NewCust.custName("Rushikesh");
		NewCust.custgender("male");
		NewCust.custdob("10","15","1985");
		Thread.sleep(5000);
		NewCust.custaddress("INDIA");
		NewCust.custcity("PUNE");
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("Window.scroll.By(0,5)","");
	//	logger.info("Scrolled the page");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//JavascriptExecutor js1=(JavascriptExecutor)driver;
		//js1.executeScript("window.scroll.By(0,500)", "");
		NewCust.custstate("Maharashtra");
		NewCust.custpinno("410504");
		NewCust.custtelephoneno("987890091");
		Thread.sleep(3000);
		
		String email=randomestring()+"@gmail.com";
		NewCust.custemailid(email);
		NewCust.custpassword("abcdef");
		NewCust.ClickSubmit();
		Thread.sleep(3000);
		logger.info("Customer created Successfully");
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight");
		//logger.info("Scrolled to bottom");
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File trg=new File("CustomerDetailsPage.png");
		FileUtils.copyFile(src, trg);
		logger.info("Taken Screenshot of Customer");
		
		captureScreenshot(driver,"NewCustomerTest");
		logger.info("Sc by Second Method");

		
	
	}
	
}
