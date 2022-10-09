package com.hyperlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktect {


public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
driver.findElement(By.linkText("Best Sellers")).click();

driver.switchTo().newWindow(WindowType.TAB);

driver.get("https://www.amazon.in/");
	
	driver.findElement(By.partialLinkText("Sellers")).click();
}
}
