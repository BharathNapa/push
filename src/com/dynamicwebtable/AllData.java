package com.dynamicwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllData {
	
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
	
		
		driver.manage().window().maximize();
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id = 'main_table_countries_today']/tbody/tr"));
		
		WebElement table = driver.findElement(By.xpath("//table[@id = 'main_table_countries_today']/thead//th"));
		
		
		
		for(int i =0; i<alldata.size(); i++) {
			
			WebElement ad = alldata.get(i);
			
			String tx = ad.getText();
			
			//System.out.println(tx);
			
			List<WebElement> data = ad.findElements(By.tagName("td"));
			
			for(int j=0; j<data.size(); j++) {
				
			     WebElement dt = data.get(j);
			     
			     System.out.println(dt.getText());
			}
		}
	}

}
