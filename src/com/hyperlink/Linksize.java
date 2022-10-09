package com.hyperlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksize {

	// how many links in a webpage
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		int size = link.size();
		
		System.out.println(size);
		
		for(WebElement links : link) {
			
			String text = links.getText(); // get the name of the link
			
			System.out.println(text);
			
			String att = links.getAttribute("href"); // get the actual link (attribue value)
			
			System.out.println(att);
		}
	}
}
