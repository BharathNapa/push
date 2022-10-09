package com.dynamicwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable_Concepts {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
	
		
		driver.manage().window().maximize();
		
		
		String givencountry = "India";
		
		List<WebElement> countries = driver.findElements(By.xpath("//table[@id = 'main_table_countries_today']//descendant::a[@class = 'mt_a']"));
	
	    for (int i = 0; i < countries.size(); i++) {
	    	
	    	
	    	WebElement gt = countries.get(i);
	    	
	    	String country = gt.getText();
	    //System.out.println(country);
	    	
	    	if(country.equals(givencountry)) {
	    		
	             List<WebElement>tableData = gt.findElements(By.xpath("//ancestor::tr[@class='odd' or @class='even']"));
	    		
	             for (int j = 0; j < tableData.size(); j++) {
	            	 
	            	 WebElement td = tableData.get(j);
	            	 
	            	 if(i==j) {
	            		 
	            		 System.out.println(td.getText());
	            	 }
					
				}
	    		
	    	}
	    	
	    	
			
	    }
	    }
	    }
	    
	
	


