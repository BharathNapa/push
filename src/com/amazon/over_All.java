package com.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class over_All {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		
		WebElement search = driver.findElement(By.xpath("//input [@id = 'twotabsearchtextbox']"));	
		
		search.sendKeys("shirts for men");
		
		int givenamount = 599;
		
		WebElement clk = driver.findElement(By.xpath("//input[@type= 'submit']"));
		
		clk.click();

		Thread.sleep(30000);
		
		List <WebElement> price = driver.findElements(By.xpath("//span[@data-component-type= 's-search-results']//descendant::span[@data-a-size= 'l']//child::span[@class = 'a-price-whole']"));
		
		
		for(int i =0; i<price.size(); i++) {
			
			WebElement gt = price.get(i);
			
			String tx = gt.getText();
			
			System.out.println(tx);
			
//			String k = tx.replace(", ", "");
//			
//			int allamount = Integer.parseInt(k);
//			
//			//System.out.println(allamount);
//			
//			if(allamount == givenamount) {
//				
//				List<WebElement> name = gt.findElements(By.xpath("//preceding::h5"));
//				
//				for(int j=0; j<name.size(); j++) {
//					
//					WebElement nm = name.get(j);
//					
//					if(i==j) {
//						
//						System.out.println(nm.getText());
//					}
//				}
//				
//			}
			
		}
		
		
	}

}
