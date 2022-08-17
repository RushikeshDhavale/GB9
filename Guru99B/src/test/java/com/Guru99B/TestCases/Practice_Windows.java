package com.Guru99B.TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Windows {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
	System.out.println(driver.getTitle());
	//driver.close();
	Set <String> s=driver.getWindowHandles();
	for (String i:s)
	{
		System.out.println(i);
		String t=driver.switchTo().window(i).getTitle();
		System.out.println(t);
		if (t.contains("Frames & windows")) {
			driver.close();
		}
	}
}
}
