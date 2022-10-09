package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(10000);
				
		WebElement product = driver.findElement(By.xpath("//div[@class='dropdown']/child::a[text()='Select Product Type']"));
		
		product.click();
		
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/child::*"));

		for(WebElement allproducts:products) {
			
			if(allproducts.getText().equals("Accounts")){
				
				allproducts.click();
				
				break;
				
			}
			
		}
		
		//Thread.sleep(10000);
		 
		
		WebElement selectproduct = driver.findElement(By.xpath("//div[@class='dropdown']/a[text()='Select Product']"));
		
		selectproduct.click();
		
		List<WebElement> products1 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/child::*"));
		
	   for(WebElement allrpoducts1:products1) {
		    
		   if(allrpoducts1.getText().equals("Current Accounts")) {
			   
			   allrpoducts1.click();
			   
		   }
		   
	   }
		
}
	

	
}