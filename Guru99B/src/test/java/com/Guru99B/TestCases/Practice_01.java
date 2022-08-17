package com.Guru99B.TestCases;

import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class Practice_01 {

	public static void main(String[] args){
		/* WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V4/");
		System.out.println("url opened");
		
		driver.findElement(By.name("uid")).sendKeys("mngr425129");
		driver.findElement(By.name("password")).sendKeys("rEruqyg");
		System.out.println("Entered username and password");
		
		driver.findElement(By.name("btnLogin")).click();
		System.out.println("Clicked on login");
		
		Actions act=new Actions(driver);
		act.moveToElement(null).build().perform();
		act.contextClick().build().perform();
		act.clickAndHold().build().perform();
		act.release();
		act.dragAndDrop(null,null).build().perform();
		act.doubleClick(); */
	
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript(args[0], )
		
		
		String pass="rushi123";
		byte[] encodepass=Base64.encode(pass.getBytes());
		String qw=new String(encodepass);
		System.out.println(qw);
		
		byte[] decodepass=Base64.decode(qw.getBytes());
		String as=new String(decodepass);
		System.out.println(as);
		
		
		System.out.println(wswuixstring("cnVzaGkxMjM="));
		System.out.println(encodestring("rushi123"));
		
		//*[@id="et_pb_contact_message_0"]
		
		
		
	}
		static String wswuixstring(String password) {
			byte[] decodepass1=Base64.decode(password.getBytes());
			//System.out.println(new String (decodepass1));
			return (new String(decodepass1));
		}
		
		static String encodestring(String encode) {
			byte[] encodeString=Base64.encode(encode.getBytes());
			//System.out.println(new String (encodeString));
			return (new String (encodeString));
		}
	}


