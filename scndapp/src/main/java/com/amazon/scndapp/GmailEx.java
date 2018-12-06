package com.amazon.scndapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailEx {
   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mounica\\Downloads\\chromedriver_win32\\chromedriver.exe");
		String userName="mounica2545@gmail.com";
		  String password ="aeemounica";
		  String toAddress="kumar.sai15nov@gmail.com";
		  String subject="WebDriver - Selenium Testing";
		   
		  //Initialising driver
		  WebDriver driver = new ChromeDriver();
		   
		  //setting timeout for page load & implicit wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		   
		  //Call Url in get method
		  driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=en");
		   
		  //Login
		  driver.findElement(By.xpath("//*[@id=\\\"identifierId\\")).sendKeys("mounica2545@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\\\"password\\\"]/div[1]/div/div[1]/input")).sendKeys("aeemounica");
		  driver.findElement(By.id("signIn")).click();
		   
		  //click on Compose button
		  driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		   
		   
		  //enter TO address & Subject
		  driver.findElement(By.xpath("//*[text()='To']/../../..//textarea")).sendKeys("kumar.sai15nov@gmail.com");
		  driver.findElement(By.name("subjectbox")).sendKeys("task");
		   
		  //click Send button
		  driver.findElement(By.xpath("//div[text()='Send']")).click();
		   
		  //Logout from Gmail
		  driver.findElement(By.xpath("//a[contains(.,'"+userName+"')]")).click();
		  driver.findElement(By.xpath("//div[contains(.,'Add account')]//a[contains(text(),'Sign out')]")).click();
		  // ChromeOptions options = new ChromeOptions();
		  //options.setPageLoadStrategy(PageLoadStrategy.NONE);
		  // Instantiate the chrome driver
		  //driver = new ChromeDriver(options);
		  // https://www.wps.com/download/?lang=en
		  
		  
		 }
		  
		}
		
	

