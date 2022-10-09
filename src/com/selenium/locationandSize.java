package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationandSize {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='Google']"));
		
		//get location - method 1
		
		System.out.println("X and Y Location :- " + img.getLocation());
		
		System.out.println("X location ;-" + img.getLocation().getX());
		
		System.out.println("Y location ;-" + img.getLocation().getY());

		
		//get location - method 2
		

		System.out.println("X location ;-" + img.getRect().getX());
		
		System.out.println("Y location ;-" + img.getRect().getY());
		
		
		//get size - method 1
		
		System.out.println("width and height ;= " + img.getSize());

		System.out.println("Height :-" + img.getSize().getHeight());
		
		System.out.println("Width :-" + img.getSize().getWidth());

		
		//get size - method 2
		
		
		System.out.println("width and height ;= " + img.getRect().getDimension());

		System.out.println("Height :-" + img.getRect().getDimension().getHeight());
		
		System.out.println("Width :-" + img.getRect().getDimension().getWidth());
	}

}
