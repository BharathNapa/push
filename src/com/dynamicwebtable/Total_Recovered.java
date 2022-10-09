package com.dynamicwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Recovered {
	
public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
	
		
		driver.manage().window().maximize();
	
	String givencountry = "India";
			
	  List<WebElement> country = driver.findElements(By.xpath("//table[@id = 'main_table_countries_today']//descendant::tbody//child::a[@class='mt_a']"));
	
	  WebElement totalrecovered = driver.findElement(By.xpath("//table[@id = 'main_table_countries_today']//preceding::th[@aria-label='TotalRecovered: activate to sort column descending']"));
	   
	 // System.out.println(totalrecovered);
	  
	for(int i =0; i<country.size(); i++) {
		
		WebElement gt = country.get(i);
	
	String tx = gt.getText();
		
		System.out.println(tx);
		
		if(tx.equals(givencountry)) {
			
	  
			List<WebElement> findElements = gt.findElements(By.xpath("//following::tbody//child::tr[@class='odd' or @class = 'even']//td[7]"));
		   
			for(int j = 0; j<findElements.size(); j++) {
				
				WebElement gt1 = findElements.get(j);
				
				if(i==j) { 
					
					
					System.out.println(gt1.getText());
				}
			
			}
			}
	}
		
		
	
}
}
