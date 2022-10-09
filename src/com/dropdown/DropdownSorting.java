package com.dropdown;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownSorting {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement s = driver.findElement(By.xpath("//select[@id = 'fruits']"));
		
		Select s1 = new Select(s);
		
		List<WebElement> options = s1.getOptions();
		
		List <Object> originallist = new ArrayList<Object>();
		List <Object> templist = new ArrayList<Object>();
		
		for(WebElement all:options) {
			
			originallist.add(all.getText());
			templist.add(all.getText());
		}
		
		System.out.println(originallist);
		System.out.println(templist);
		
	 
				
	}
	
	
       
}
