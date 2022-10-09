package com.macy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {
	
	private static void price() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement men = driver.findElement(By.xpath("//a[@data-group = 'men']"));
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@class=\"desktop-categoryLink\"])[1]"));
		
		act.moveToElement(men).build().perform();
		
		act.moveToElement(tshirts).click().build().perform();
		
		int givenAmount = 349;
		
		List<WebElement> price = driver.findElements(By.xpath("//ul[@class = 'results-base']/descendant::div[@class='product-productMetaInfo']//child::span[@class='product-discountedPrice']"));
		
		List<Object> lt =  new ArrayList <Object> ();
		
		for(int i =0; i<price.size(); i++) {
			
			   WebElement allprice = price.get(i);
			
			String text = allprice.getText();
			
			//System.out.println(text);
			
			String replaceAll = text.replaceAll("Rs. ", "");
			
			int parseInt = Integer.parseInt(replaceAll);
			
			lt.add(parseInt);
			
			if(givenAmount == parseInt) {
				
				List<WebElement> product = allprice.findElements(By.xpath("//ancestor::div[@class='product-productMetaInfo']//child::h3[@class='product-brand']"));		
				
				for(int j=0; j<product.size(); j++) {
					
					WebElement text2 = product.get(j);
					
					if(i == j) {
						
						System.out.println(text2.getText());
					}
				}
			}
			
			
		}
			
			
		}
	
		
	public static void main(String[] args) {
		
		price();
		
	}
		
	}


