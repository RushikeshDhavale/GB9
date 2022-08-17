package com.Guru99B.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	/*	int rownum=driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr")).size();
		System.out.println("Number of rows are:"+rownum);
		int colnum=driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr/th")).size();
		System.out.println("Number of rows are:"+colnum);*/
		
		/*for (int i=2;i<=rownum;i++)
		{
			for (int j=1;j<=colnum;j++) {
				System.out.print(driver.findElement(By.xpath("//*[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
			}
			
			System.out.println();
		}
		*/
		
		//System.out.println("Complete Table");
		//System.out.println("Closing Browser");
		
		/*String a=driver.findElement(By.xpath("//*[@id=\"field1\"]")).getAttribute("value");
		String b=driver.findElement(By.xpath("//*[@id=\"field2\"]")).getAttribute("value");
		System.out.println("Box1 value is:"+a);
		System.out.println("Box2 value is:"+b);*/

		driver.findElement(By.id("datepicker")).click();
		System.out.println("clicked on date-picker");
		String title=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println("captured title");
		System.out.println("Title of page is:"+title);
	
		String month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
		System.out.println("captured month");
		System.out.println(month);
		
		String Cyear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		System.out.println("captured year");
		System.out.println(Cyear);
		
		WebElement next=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		WebElement prev=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span"));
		String expyear="January 2023";
		String day="20";
		
		while (true){
			Cyear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			System.out.println(Cyear);
			
			if (Cyear.equals(expyear)) 
			{
				break;
			}
			else
			{
			next.click();
			}
		}
		
	/* (title!="January 2023") {
		next.click();
	}*/
	
	//WebElement date=driver.findElement(By.xapth("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
	
	/*if (title=="January 2023") {
		driver.findElement(By.linkText("15")).click();
	}*/
	}
}
