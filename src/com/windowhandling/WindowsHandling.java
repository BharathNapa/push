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

public class WindowsHandling {
	
	
	public static void main(String[] args) throws InterruptedException,  IOException, AWTException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement bestsellers = driver.findElement(By.xpath("(//a [text() = 'Best Sellers'])[1]"));
		
	     Actions act = new Actions(driver);
	     
	     act.contextClick(bestsellers).build().perform();
	     
	    
	     
	     Robot r = new Robot();
	     
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     
	    // Thread.sleep(3000);
		
	     driver.get("https://www.amazon.in/");
			
			WebElement mobiles = driver.findElement(By.xpath("//a [text() = 'Mobiles']"));
			
		     Actions act1 = new Actions(driver);
		     
		     act1.contextClick(mobiles).build().perform();
		     
		     
		     Robot r1 = new Robot();
		     
		     r1.keyPress(KeyEvent.VK_DOWN);
		     r1.keyRelease(KeyEvent.VK_DOWN);
		     r1.keyPress(KeyEvent.VK_ENTER);
		     r1.keyRelease(KeyEvent.VK_ENTER);
		     
		     
		    // Thread.sleep(3000);
				
		     driver.get("https://www.amazon.in/");
				
				WebElement todaysdeal = driver.findElement(By.xpath("(//a[@tabindex = '0'])[7]"));
				
			     Actions act2 = new Actions(driver);
			     
			     act2.contextClick(todaysdeal).build().perform();
			     
			     
			     Robot r2 = new Robot();
			     
			     r2.keyPress(KeyEvent.VK_DOWN);
			     r2.keyRelease(KeyEvent.VK_DOWN);
			     r2.keyPress(KeyEvent.VK_ENTER);
			     r2.keyRelease(KeyEvent.VK_ENTER);

			     //Thread.sleep(3000);
					
			     driver.get("https://www.amazon.in/");
					
					WebElement coustmerservice = driver.findElement(By.xpath("(//a[@tabindex = '0'])[8]"));
					
				     Actions act3 = new Actions(driver);
				     
				     act3.contextClick(coustmerservice).build().perform();
				     
				     
				     Robot r3 = new Robot();
				     
				     r3.keyPress(KeyEvent.VK_DOWN);
				     r3.keyRelease(KeyEvent.VK_DOWN);
				     r3.keyPress(KeyEvent.VK_ENTER);
				     r3.keyRelease(KeyEvent.VK_ENTER);
				     
				     String sw = driver.getWindowHandle();
				     
				     System.out.println(sw);
				     
				     Set<String> aw = driver.getWindowHandles();
				     
				    for(String cp : aw) {
				    	
				    	String title = driver.switchTo().window(cp).getTitle();
				    	
				    	System.out.println(title);
				    	
				    }
				     
				    
				    String s1 = "Help - Amazon Customer Service";
				    
				    for(String cp1 : aw) {
				    	
				    	if(driver.switchTo().window(cp1).getTitle().equals(s1)){
				    		
					    	break;

				    	}
				    	
				    }
				     
				     Thread.sleep(5000);
				     
				     TakesScreenshot ts =(TakesScreenshot) driver;
				     
				     File source = ts.getScreenshotAs(OutputType.FILE);
				     
				     File des = new File("C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\SS\\pic1.png");
				     
				     FileUtils.copyFile(source, des);
				     
				     String s2 = "Amazon.in | Prime Day 2022";
					    
					    for(String cp2 : aw) {
					    	
					    	if(driver.switchTo().window(cp2).getTitle().equals(s2)){
					    		
						    	break;

					    	}
					    	
					    }
					     
					     Thread.sleep(5000);
					     
					     TakesScreenshot ts1 =(TakesScreenshot) driver;
					     
					     File source1 = ts1.getScreenshotAs(OutputType.FILE);
					     
					     File des1 = new File("C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\SS\\pic2.png");
					     
					     FileUtils.copyFile(source1, des1);
					     
					     
                         String s3 = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
						    
						    for(String cp3 : aw) {
						    	
						    	if(driver.switchTo().window(cp3).getTitle().equals(s3)){
						    		
							    	break;

						    	}
						    	
						    }
						     
						     Thread.sleep(5000);
						     
						     TakesScreenshot ts2 =(TakesScreenshot) driver;
						     
						     File source2 = ts2.getScreenshotAs(OutputType.FILE);
						     
						     File des2 = new File("C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\SS\\pic3.png");
						     
						     FileUtils.copyFile(source2, des2);
						     
						     String s4 = "Amazon.in Bestsellers: The most popular items on Amazon";
							    
							    for(String cp4 : aw) {
							    	
							    	if(driver.switchTo().window(cp4).getTitle().equals(s4)){
							    		
								    	break;

							    	}
							    	
							    }
							     
							     Thread.sleep(5000);
							     
							     TakesScreenshot ts3 =(TakesScreenshot) driver;
							     
							     File source3 = ts3.getScreenshotAs(OutputType.FILE);
							     
							     File des3 = new File("C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\SS\\pic4.png");
							     
							     FileUtils.copyFile(source3, des3);
							     
							 
	
                                 for(String cp3 : aw) {
                                	 
                                	if (!cp3.equals(sw)) {
                                		
                                		driver.switchTo().equals(cp3);
                                		
                                		driver.close();
										
									}
                                		 
                                		 
                                		 
                                		 
                                	 }
	}

}
