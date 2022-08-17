package com.Guru99B.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Guru99B.PageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckVAlidity extends BaseClass{
	
		@Test
		public void testLink() throws InterruptedException
		{
		LoginPage lp=new LoginPage(driver);
		lp.getusername(username);
		logger.info("Entered Username");
		lp.setpassword(password);
		Thread.sleep(3000);
		logger.info("Entered password");
		lp.clicksubmit();
		logger.info("Clicked on Login");
		System.out.println(driver.findElement(By.linkText("New Customer")).isDisplayed());
		driver.findElement(By.linkText("New Customer")).click();
		logger.info("Clicked on New Customer");
		
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/manager/Managerhomepage.php");
		System.out.println(driver.findElement(By.linkText("New Customer")).isDisplayed());
		driver.findElement(By.linkText("New Customer")).click();
		System.out.println("clicked on link");
		Thread.sleep(5000);
		driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		System.out.println("switch to frame1");
		driver.switchTo().frame("ad_iframe");
		Thread.sleep(2000);
		System.out.println("switch to frame2");
		System.out.println(driver.findElement(By.id("dismiss-button")).isDisplayed());
		System.out.println("Element is present");
		driver.findElement(By.id("dismiss-button")).click();
		System.out.println("ad closed");
		driver.switchTo().defaultContent();
		driver.findElement(By.name("name")).sendKeys("Rushikesh");
		System.out.println("<----Done----->");*/

	}
	
	
	}
	
