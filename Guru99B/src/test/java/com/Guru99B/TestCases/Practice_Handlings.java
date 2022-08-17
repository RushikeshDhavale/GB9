package com.Guru99B.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Handlings {
	
	@Test
	public void Practice() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(3000);
		
		/*System.out.println("Alert Test Started");
		driver.findElement(By.name("alert")).click();
		Thread.sleep(3000);
		String alert_text=driver.switchTo().alert().getText();
		System.out.println(alert_text);
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println("Alert Test Completed");
		
		System.out.println("confirmation Test Started");
		driver.findElement(By.name("confirmation")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("confirmation accepted");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println("confirmation accept Test Completed");
		
		driver.findElement(By.name("confirmation")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("confirmation cancled");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println("confirmation cancle Test Completed");
		System.out.println("confirmation Test completed");*/
		
		/*System.out.println("prompt Test started");
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on prompt");
		driver.switchTo().alert().sendKeys("Rushikesh");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//driver.switchTo().defaultContent();
		System.out.println("prompt Test started");*/
		
		WebElement Drop=driver.findElement(By.id("sub-menu"));
		System.out.println(Drop.isDisplayed());
		Select drp=new Select (Drop);
		drp.selectByIndex(1);
		Thread.sleep(5000);
		WebElement logo=driver.findElement(By.id("logo"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File dest=new File("logo.png");
		FileUtils.copyFile(src, dest);

		driver.switchTo().newWindow(WindowType.TAB);
		
;	}

}
