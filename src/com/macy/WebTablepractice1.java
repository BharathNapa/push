package com.macy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablepractice1 {
	
   public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.worldometers.info/coronavirus/");
	   
	   List<WebElement> countries = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/child::tr"));
	   
	   for(int i=0; i<countries.size(); i++) {
		   
		   WebElement text = countries.get(i);
		   
		   String text2 = text.getText();
		   
		   System.out.println(text2);
	   }
	   
	   
}
}
