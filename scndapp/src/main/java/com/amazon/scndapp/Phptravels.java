package com.amazon.scndapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravels {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mounica\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       
	       WebDriver driver=new ChromeDriver();
	       String baseUrl="https://www.google.com/ ";
           String actualTitle="";
	       driver.get(baseUrl);
	       driver.manage().window().maximize();
	       actualTitle=driver.getTitle();
	       String expectedTitle=driver.getTitle();
	       WebElement php=driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
	       php.click();
	       php.sendKeys("phptravels register");
	       php.submit();
	       driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a/h3")).click();
	       driver.findElement(By.xpath("//*[@id=\"inputFirstName\"]")).sendKeys("indra");
	       driver.findElement(By.xpath("//*[@id=\"inputLastName\"]")).sendKeys("maattla");
	       driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("efg254@gmail.com");
	      
	       driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[3]")).click();
	      
	       driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]/span[1]")).click();
	       driver.findElement(By.xpath("//*[@id=\"inputPhone\"]")).sendKeys("7097791819");
	      
	       driver.findElement(By.xpath("//*[@id=\"inputCompanyName\"]")).sendKeys("Accenture");
	      
	       driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys("diesel colony");
	       
	       driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]")).sendKeys("babujinagar");
	      
	       driver.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("kazipet");
	      
	       driver.findElement(By.xpath("//*[@id=\"stateinput\"]")).sendKeys("Telangana");
	      
	       driver.findElement(By.xpath("//*[@id=\"inputPostcode\"]")).sendKeys("506002");
	      
	       driver.findElement(By.xpath("//*[@id=\"inputCountry\"]")).sendKeys("India");
	       driver.findElement(By.xpath("//*[@id=\"customfield1\"]")).sendKeys("Google");
	    
	       driver.findElement(By.xpath("//*[@id=\"customfield2\"]")).sendKeys("7087881819");
	    
	       driver.findElement(By.xpath("//*[@id=\"inputNewPassword1\"]")).sendKeys("anu124");
	   
	       driver.findElement(By.xpath("//*[@id=\"inputNewPassword2\"]")).sendKeys("anu124");
	   
	       driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/div[3]/div/div/span[2]")).click();
	    
	      if(actualTitle.contentEquals(expectedTitle))
	       {
	    	   System.out.println("test passed");
	       }
	       else
	       {
	    	   System.out.println("test failed");
	       } 
	      
	}
}
