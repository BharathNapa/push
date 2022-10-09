package com.myntra;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Demo {
	
	public static WebDriver driver;
	
	public void productName() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");

		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		
		
	WebElement men = driver.findElement(By.xpath("(//a[@class  = 'desktop-main'])[1]"));
		
	WebElement tshirts = driver.findElement(By.xpath("(//a[@class  = 'desktop-categoryLink'])[1]"));
		

	act.moveToElement(men).build().perform();

	act.moveToElement(tshirts).click().build().perform();
	
	int givenamount = 199;
	
	List<WebElement> prices = driver.findElements(By.xpath("//ul[@class = 'results-base']/descendant::span[ @class= 'product-discountedPrice']"));

	for(int i = 0; i<prices.size(); i++) {
		
		WebElement price = prices.get(i);
		
		String text = price.getText();
		
		String replaceAll = text.replace("Rs. ", "");
		
		int parseInt = Integer.parseInt(replaceAll);
		
		
		if (parseInt==givenamount) {
			
		List<WebElement> productName = price.findElements(By.xpath("//ancestor::div[@class = 'product-productMetaInfo']/child::h3[@class='product-brand']"));
			
			for(int j = 0; j<productName.size(); j++) {
				
				WebElement webElement = productName.get(j);
						
     if(i==j) {
    	 
    	 System.out.println(webElement.getText());
     }
				
			}
			
			
		}
		
	}
			
			
	
	
	
	
	}
	
	private void productName1(int givenamount1) {
		
		//driver.navigate().refresh();
		

		
		List<WebElement> prices = driver.findElements(By.xpath("//ul[@class = 'results-base']/descendant::span[ @class= 'product-discountedPrice']"));

		for(int i = 0; i<prices.size(); i++) {
			
			WebElement price = prices.get(i);
			
			String text = price.getText();
			
			String replaceAll = text.replace("Rs. ", "");
			
			int parseInt = Integer.parseInt(replaceAll);
			
			
			if (parseInt==givenamount1) {
				
			List<WebElement> productName = price.findElements(By.xpath("//ancestor::div[@class = 'product-productMetaInfo']/child::h3[@class='product-brand']"));
				
				for(int j = 0; j<productName.size(); j++) {
					
					WebElement webElement = productName.get(j);
							
	     if(i==j) {
	    	 
	    	 System.out.println(webElement.getText());
	     }
					
				}
				
				
			}
			
		}
				
				
		
		
		
		
		}

	public static void main(String[] args) {
		
		Myntra_Demo md = new Myntra_Demo();
		
		md.productName();
		
		md.productName1(359);
		
	}
	}
	
	
	


