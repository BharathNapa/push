package com.webelements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
	Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class = 'login']"));
		
		signin.click();
		
		WebElement click = driver.findElement(By.xpath("//a[@title = 'Women']"));
		
		click.click();
		
		WebElement shorts = driver.findElement(By.xpath("//*[@id = \"center_column\"]/ul/li[1]/div/div[1]/div/a/img"));
	
	   shorts.click();
	   
	   Thread.sleep(5000);
	   
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   
	   File des = new File ("C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\SS\\pic1.png");
	   
	   FileUtils.copyFile(source, des);
	   
	   
	}
	

}
