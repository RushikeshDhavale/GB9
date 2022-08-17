package com.Guru99B.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String month="January 2023";
		String day="20";
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		//String text=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		//System.out.println(text);
		while(true)
		{
			String text=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			if (text.equals(month)) 
			{
				break;
			}else
			{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			Thread.sleep(1000);
			}
		}
		
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[contains(text(),'31')]")).click();
	}
}
