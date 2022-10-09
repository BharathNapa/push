package com.hyperlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		int count = 0;
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement links : link) {
			
			String att = links.getAttribute("href");
			
			System.out.println(att);
			
			
			if(att==null || att.isEmpty()) {
				
				System.out.println(att + "It is null");
				
				 continue;
			}
			
			URL u = new URL(att);
			
			HttpURLConnection connect = (HttpURLConnection) u.openConnection();
			
			if(connect.getResponseCode()>400) {
				
				System.out.println(connect + " -; It is a broken link");
				
				count++;
				
			}else {
				
				System.out.println(connect+" ;- It is not a broken link");
				
			}
		}
		
		System.out.println("No of broken links :-" + count);
	}

	
}
