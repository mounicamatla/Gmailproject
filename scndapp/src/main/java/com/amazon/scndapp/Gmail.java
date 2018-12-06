package com.amazon.scndapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mounica\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       
	       WebDriver driver=new ChromeDriver();
	       String baseUrl="https://www.google.com/ ";
           String actualTitle="";
           actualTitle=driver.getTitle();
	       String expectedTitle=driver.getTitle();
	       driver.get(baseUrl);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			   
	       WebElement gmail=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
	       gmail.click();
	       gmail.sendKeys("gmail sign in");
	       gmail.submit();
    	
	        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
	        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mounica2545@gmail.com");
	        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
	        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("aeemounica");
	        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[2]/c-wiz/div/div/div[5]/div[1]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id=\":ko\"]/div/div[2]/span/a")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//div[@class='z0']/div")).click();
	        driver.findElement(By.xpath("//*[text()='To']/../../..//textarea")).sendKeys("kumar.sai15nov@gmail.com");
	        driver.findElement(By.name("subjectbox")).sendKeys("task");
	        driver.findElement(By.cssSelector(".Am.Al.editable.LW-avf")).click();
	        driver.findElement(By.cssSelector(".Am.Al.editable.LW-avf")).sendKeys("sir when i used to run dis app at any time its working. no errors");
	        //driver.findElement(By.xpath("//*[@id=\":r7\"]")).click();//clas a1 aaA aMZ
	        driver.findElement(By.xpath("//div[text()='Send']")).click();////*[@id=":16e"] &//div[text()='Send']
	        Thread.sleep(15000);
	       // driver.findElement(By.xpath("")).click();
	       // driver.findElement(By.xpath("")).click();
	        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]")).click();
	        driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	        System.out.println(expectedTitle);
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
