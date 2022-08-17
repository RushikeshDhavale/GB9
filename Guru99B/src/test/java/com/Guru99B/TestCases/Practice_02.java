package com.Guru99B.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_02 {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		WebElement img=driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
		act.moveToElement(img).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//span[contains(text(),'Quick view')]")).click();
		Thread.sleep(3000);
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		Thread.sleep(3000);
		
		List <WebElement> shirtlist=driver.findElements(By.xpath("//*[@id=\"thumbs_list_frame\"]/child::li"));
		System.out.println(shirtlist.size());
		
			WebElement shirt1=driver.findElement(By.id("bigpic"));
			File source1=shirt1.getScreenshotAs(OutputType.FILE);
			File target1=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"Shirt 1"+".png");
			FileUtils.copyFile(source1, target1);
			System.out.println("Screenshot 1 Taken");

			WebElement shirtlist4=driver.findElement(By.xpath("//*[@id=\"thumbs_list_frame\"]/child::li[2]"));
			act.moveToElement(shirtlist4).build().perform();
			Thread.sleep(10000);
			WebElement pict4=driver.findElement(By.id("bigpic"));
			System.out.println("Element "+1+" found");
			
			File source4=pict4.getScreenshotAs(OutputType.FILE);
			File target4=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"Shirt"+2+".png");
			FileUtils.copyFile(source4, target4);
			System.out.println("Screenshot"+2+" Taken");
			Thread.sleep(2000);
			
			WebElement shirtlist2=driver.findElement(By.xpath("//*[@id=\"thumbs_list_frame\"]/child::li[3]"));
			act.moveToElement(shirtlist2).build().perform();
			Thread.sleep(10000);
			WebElement pict2=driver.findElement(By.id("bigpic"));
			System.out.println("Element "+2+" found");
			
			File source2=pict2.getScreenshotAs(OutputType.FILE);
			File target2=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"Shirt"+3+".png");
			FileUtils.copyFile(source2, target2);
			System.out.println("Screenshot"+3+" Taken");
			Thread.sleep(2000);
			
			WebElement shirtlist3=driver.findElement(By.xpath("//*[@id=\"thumbs_list_frame\"]/child::li[4]"));
			act.moveToElement(shirtlist3).build().perform();
			Thread.sleep(10000);
			WebElement pict3=driver.findElement(By.id("bigpic"));
			System.out.println("Element "+3+" found");
			
			File source3=pict3.getScreenshotAs(OutputType.FILE);
			File target3=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"Shirt"+4+".png");
			FileUtils.copyFile(source3, target3);
			System.out.println("Screenshot"+4+" Taken");
			Thread.sleep(2000);
			
	}
}
