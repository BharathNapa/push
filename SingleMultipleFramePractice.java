package com.singleframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleMultipleFramePractice {
	
	
	public static void main(String[] args) throws InterruptedException {
		
         String url = "http://demo.automationtesting.in/Frames.html" ;
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Seleniumpractice\\driver\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver ();
		  
		  
		          
		  
			 driver.get("https://www.google.co.in/");
			 
			
		
	         driver.manage().window().maximize();
		
	               
	         driver.get(url);
	         
	        WebElement sf = driver.findElement(By.xpath("(//iframe[@src = 'SingleFrame.html'])[1]"));
	        
	        driver.switchTo().frame(sf);
	         
	        WebElement name = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
	         
	         name.sendKeys("bharath");
	         
	         driver.switchTo().defaultContent();
	         
	         WebElement df = driver.findElement(By.xpath("//a[text() = 'Iframe with in an Iframe']"));
	         
	         df.click();
	         
	         WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
	         
	         driver.switchTo().frame(outerFrame);
	         
	         WebElement innerFrame = driver.findElement(By.xpath("(//iframe[@src = 'SingleFrame.html'])[1]"));
	         
	         driver.switchTo().frame(innerFrame);
	         
	         WebElement sk = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
	         
	         sk.sendKeys("Napa");
	         
			driver.switchTo().defaultContent();
			
			WebElement clk = driver.findElement(By.xpath("//a[text() = 'Interactions ']"));
			
			clk.click();
	}

}
