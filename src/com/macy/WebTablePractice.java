package com.macy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {
	
	
	public static void activeCase () {
		
		
		System.setProperty("webdriver.chrome.diver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
		List <String> li = new ArrayList <String> ();
		
		String givenCountry = "France";
		
 List<WebElement> activecases = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/child::tbody/descendant::a[@class='mt_a']"));

 WebElement country = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/child::thead/descendant::th[@aria-label='ActiveCases: activate to sort column descending']"));
		
 for(int i=0; i<activecases.size(); i++) {
			
			WebElement countries= activecases.get(i);
			
			String text = countries.getText();
			
			li.add(text);
			
			if(text.equals(givenCountry)) {
				
				List<WebElement> active = driver.findElements(By.xpath("//following::tbody/child::tr[@class='even' or @class='odd']//td[9]"));
				
				for(int j=0; j<active.size(); j++) {
					
					WebElement cases = active.get(i);
					
					String text2 = cases.getText();
					
					if(i==j) {
						
						System.out.println(text2);
					}
				}
			}
			
			}
		
	}
	
	public static void main(String[] args) {
		
		activeCase();
	}

}


