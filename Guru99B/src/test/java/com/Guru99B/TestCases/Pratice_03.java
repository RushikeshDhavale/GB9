package com.Guru99B.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pratice_03 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Url opened");
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		WebElement img=driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
		Thread.sleep(3000);
		act.moveToElement(img).build().perform();
		System.out.println("Moved to element");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li/div/div[1]/div/a[2]")).click();
		System.out.println("Clicked on \"Quick View\"");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		Thread.sleep(2000);
		
		List <WebElement> shirtlistm=driver.findElements(By.xpath("//*[@id='thumbs_list_frame']/child::li"));
		System.out.println("The number of shirt-products on page is :"+shirtlistm.size());
		
		/*for (int i=1;i<=shirtlistm.size();i++) {
			WebElement shirtlist=driver.findElement(By.xpath("//ul[@id='thumbs_list_frame']/li["+i+"]/descendant::img[@class='img-responsive']"));
			System.out.println("Element "+i+" found");
			System.out.println(shirtlist);
			act.moveToElement(shirtlist).click().build().perform();
			Thread.sleep(3000);
			System.out.println("moved to element "+i);
			
			WebElement pict=driver.findElement(By.id("bigpic"));
			File source=pict.getScreenshotAs(OutputType.FILE);
			File target=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"Picture"+i+".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot"+i+" Taken");
			Thread.sleep(2000);
		}*/
		
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		System.out.println("one extra quantity added");
		driver.findElement(By.xpath("//p[@id='add_to_cart']/descendant::span")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on add to cart");
		Thread.sleep(3000);
		WebElement CartTitle1=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
		System.out.println(CartTitle1.isDisplayed());
		String CartTitle=CartTitle1.getText();
		
		if (CartTitle.equals("Product successfully added to your shopping cart")) {
			System.out.println("Sucessfully added to cart");
		}else {
			System.out.println("product not added to cart successfully");
		}
		
		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/span")).click();
		Thread.sleep(3000);
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
		Thread.sleep(3000);
		act.moveToElement(cart).moveToElement(checkout).click().build().perform();
		System.out.println("moved to cart");
		Thread.sleep(5000);
		String quantity=driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[5]/input[2]")).getText();
		System.out.println("quantity is: "+quantity);
		
		if (quantity.equals("2"))
		{
			System.out.println("present 2 items in cart");
		}else {
			System.out.println("The items not added successfully");
		}
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]")).click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\Screenshots\\"+"Homepage.png");
		Thread.sleep(3000);
		FileUtils.copyFile(source, target);
		System.out.println("Homepage Screenshot taken");
		System.out.println("Test Completed");
		
		System.out.println("Cookie Test");
		
		Set <Cookie> koook=driver.manage().getCookies();
		System.out.println(koook.size());
		
		for (Cookie kook:koook) {
			System.out.println(kook.getName()+" : "+kook.getValue());
		}
		
		Cookie asd=new Cookie("rushi","dhavale");
		driver.manage().addCookie(asd);
		Set <Cookie> kok=driver.manage().getCookies();
		System.out.println(kok.size());
		
		
		for (Cookie kosk:kok) {
			System.out.println(kosk.getName()+" : "+kosk.getValue());
		}
		System.out.println("Cookie Test completed");
		driver.switchTo().defaultContent();
		driver.close();
	}

}
