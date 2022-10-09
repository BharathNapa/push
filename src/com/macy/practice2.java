package com.macy;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.diver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[1]"));
		
		act.moveToElement(men).build().perform();
		
		act.moveToElement(tshirt).click().build().perform();
		
		List <WebElement> price = driver.findElements(By.xpath("//ul[@class='results-base']//descendant::div[@class='product-productMetaInfo']//child::span[@class='product-discountedPrice']"));
		
		Set<Integer> list =  new HashSet <Integer> ();
		
		for(WebElement allprice : price) {
			
			String text = allprice.getText();
			
			String replaceAll = text.replaceAll("Rs. ", "");
			
			int parseInt = Integer.parseInt(replaceAll);
			
			list.add(parseInt);
			
		}
		
		Integer min = Collections.min(list);
		
		System.out.println(min);
		
	}

}
