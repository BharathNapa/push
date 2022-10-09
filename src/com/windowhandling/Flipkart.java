package com.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class Flipkart {

	public static WebDriver driver;
	
	public static Set<String> allWindows;
	
	public static String title;
	
	public static List<String> titles;

	  public static void  parentWindow() {

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");

			 driver = new ChromeDriver();



			driver.get("https://www.flipkart.com/search?q=iphone13promax&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

			driver.manage().window().maximize();
			
			 title = driver.getTitle();
		 
          	}
	
	
		

		public static void getTitle() {
			
			
			 titles = new LinkedList<>();
			
			driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 Pro Max (Graphite, 128 GB)']")).click();
			
		       driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 Pro Max (Gold, 1 TB)']")).click();

				
		       driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 Pro Max (Silver, 128 GB)']")).click();

		      driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 Pro Max (Alpine Green, 128 GB)']")).click();

              
		      allWindows = driver.getWindowHandles();
		      
		      for (String wind : allWindows) {
		    	  
		    	  title = driver.switchTo().window(wind).getTitle();
		    	  
		    	 System.out.println(title);
		    	  
		    	  titles.add(title); 
				
			}
		}
		
		
		public static void getAmount() {
			
			
			for (String win : allWindows) {
				
				for (int j = 1; j<titles.size(); j++) {
					
					if(driver.switchTo().window(win).getTitle().equals(titles.get(j))) {
						
						
						WebElement price = driver.findElement(By.xpath("//span[contains(text(),'Reviews')]/ancestor::div[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]"));
						
				                 String text = price.getText();
				                 
				                 String st = text.toString();
				                 
				                 System.out.println(st);
						
						
					}
					
				}
				
			}

		}
		 
		
		public static void main(String[] args) {
			
			parentWindow();
			
			getTitle();
			
			getAmount();
			
		}
      
      
		

	




}
