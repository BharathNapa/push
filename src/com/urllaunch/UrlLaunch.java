package com.urllaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlLaunch {
	
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
		
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.hotstar.com/in");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
	}

}
