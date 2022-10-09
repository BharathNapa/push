package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/showcase");
		
		
//      Hightlighting the element(flash)
//		
//	WebElement logo = driver.findElement(By.xpath("//img[@title='nopCommerce']"));
//
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//	js.executeScript("arguments[0].style.border='3px solid red'", logo);
		
		
	//getting title of the page
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String st = js.executeScript("return document.title").toString();
		
		System.out.println(st);
		
		
		//generate an alert
//		String s = "Bharath";
//		
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		
//		js1.executeScript("alert('"+s+"')");
		
		
		//refresh page
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		
		js2.executeScript("history.go(0)");
		
		//zoom in and out
	  
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		
		js3.executeScript("document.body.style.zoom='50%'");
		
		
		
	}

}
