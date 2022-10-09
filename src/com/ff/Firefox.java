 package com.ff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firefox {
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\msedgedriver.exe");
//		
//		WebDriver driver = new EdgeDriver();
//		
//		driver.get("https://www.google.com/");
	
	
	System.setProperty("webdriver.ie.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\IEDriverServer.exe");
	
	WebDriver driver = new InternetExplorerDriver();
	
	driver.get("https://www.google.com/");

}

}
