package com.hyperlink;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
	
	public static void main (String args[]) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://info.sice.indiana.edu/~hrosenba/Demo/Demo2.html#Part_2");
		
		//WebElement clk = driver.findElement(By.linkText("link")).click();
		
		WebElement clk = driver.findElement(By.linkText("link"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()",clk);
		
		
	}

}
