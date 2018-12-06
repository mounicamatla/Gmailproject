package com.amazon.scndapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\mounica\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       
	       WebDriver driver=new ChromeDriver();
	       String baseUrl="https://www.google.com/ ";
	      // String expectedTitle=driver.getTitle();
           String actualTitle="";
	       
	       driver.get(baseUrl);
	       driver.manage().window().maximize();
	       
	       actualTitle=driver.getTitle();
	       String expectedTitle=driver.getTitle();
	       WebElement amaz= driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
	       amaz.click();
	       amaz.sendKeys("amazon");
	       amaz.submit();
	       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
	       driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.className("action-inner")).click();
	       driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i[1]")).click();
	       driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]/span[2]")).click();
	       driver.findElement(By.xpath("//*[@id=\"shopAllLinks\"]/tbody/tr/td[2]/div[3]/ul/li[2]/a")).click();
	       driver.findElement(By.xpath("//*[@id=\"merchandised-content\"]/div[1]/div[1]/div/div/p/a[1]")).click();
	       Thread.sleep(2000);
	       //driver.findElement(By.linkText(" Women's Silk Skater Dress")).click();
	       driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]")).click();
	       //https://phptravels.org/register.php
	       System.out.println(driver.getTitle());
	       //System.out.println(expectedTitle);
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
