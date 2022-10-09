package com.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingPractice {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
        String url = "http://www.amazon.in/" ;

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Seleniumpractice\\driver\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver ();
			 
		  
 		 TakesScreenshot ts = (TakesScreenshot) driver;

	         driver.manage().window().maximize();
		
	               
	         driver.get(url);   
	         
	         WebElement bs = driver.findElement(By.xpath("//a[text() ='Best Sellers']"));
	         
	         Actions act = new Actions(driver);
	         
	         act.contextClick(bs).build().perform();
	         
	        	         
	        Robot r = new Robot();
	        
	        r.keyPress(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyPress(KeyEvent.VK_ENTER);
	        
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        
	        Thread.sleep(2000);	        
	        
	        WebElement mob = driver.findElement(By.xpath("//a[text() = 'Mobiles']"));
	        
	        act.contextClick(mob).build().perform();	     
	        
            r.keyPress(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyPress(KeyEvent.VK_ENTER);
	        
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        Thread.sleep(3000);	
	        
	        
	        WebElement cs = driver.findElement(By.xpath("//a[text() = 'Customer Service']"));
	        
	        act.contextClick(cs).build().perform();
	        
            r.keyPress(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyPress(KeyEvent.VK_ENTER);
	        
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        Thread.sleep(2000);	        
	        
	       WebElement td = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
	       
	       act.contextClick(td).build().perform();
	       
	       r.keyPress(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        
	        r.keyPress(KeyEvent.VK_ENTER);
	        
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        
	       Thread.sleep(3000);
	       
//	       int si = driver.getWindowHandles().size();
//	       
//	       System.out.println(si);
//	       
 String st = driver.getWindowHandle();
	       
System.out.println(st);
	       
	       System.out.println("-----------------------");
	       
	       Set<String> handles = driver.getWindowHandles();
	       
	       for (String cp : handles) {
	    	   
	    	   String title = driver.switchTo().window(cp).getTitle();
			
	    	   System.out.println(title);
	    	   
	       }
	    	   
	    	 Thread.sleep(2000);
	    	   
	    	   String s1 = "Help - Amazon Customer Service";
	    	   
	    	   for (String cp1 : handles) {
	    		   
	    		   if(driver.switchTo().window(cp1).getTitle().equals(s1)) {
	    			   
	    			   break;
	    		   }
	    	    
	    	   }  
	    	   
	    	   
	    	   Thread.sleep(5000);
	    		  
	    		  	    		 
	    		 File source = ts.getScreenshotAs(OutputType.FILE);
	    		 
	    		 File des = new File("C:\\Users\\lenovo\\eclipse-workspace\\Seleniumpractice\\ss.pic9.png");
	    		 
	    		 FileUtils.copyFile(source, des);
	    		 
	    		 
	    		
	    		 
	    		 
	    		   String s2 = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		    	   
		    	   for (String cp1 : handles) {
		    		   
		    		   if(driver.switchTo().window(cp1).getTitle().equals(s2)) {
		    			   
		    			   break;
		    		 }
		    		   
		    	}  
		    	   
		    	   Thread.sleep(5000);
		    		  
	  	    		 
		    		 File source1 = ts.getScreenshotAs(OutputType.FILE);
		    		 
		    		 File des1 = new File("C:\\Users\\lenovo\\eclipse-workspace\\Seleniumpractice\\ss.pic10.png");
		    		 
		    		 FileUtils.copyFile(source1, des1);
		    		 
		    		 
		    		 
		    		 
		    		 String s3 = "Amazon.in Bestsellers: The most popular items on Amazon";
		    		 
		    	      for (String CP2 : handles) {
		    	    	  
		    	    	  if (driver.switchTo().window(CP2).getTitle().equals(s3)) {
		    	    	  
		    	    	 }
		    	    	  
		    	     }
		    	      
		    	      Thread.sleep(5000);
		    	      
		    	      File source2 = ts.getScreenshotAs(OutputType.FILE);
		    	      
		    	      File des2 = new File("C:\\Users\\lenovo\\eclipse-workspace\\Seleniumpractice\\ss.pic11.png");
		    	      
		    	      FileUtils.copyFile(source2, des2);
		    	      
		    	      
		    	      for (String cp : handles) {
						
		    	    	  if(!cp.equals(st)) {
		    	    		  
		    	    		  driver.switchTo().window(cp);
		    	    		  
		    	    		  driver.close();
		    	    		  
		    	    		  
		    	    	  }
					}
		    	        
		    	      
		    	      
		    	      }
	    		 
	    	   
}
	        
	

	
