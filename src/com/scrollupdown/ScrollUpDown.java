package com.scrollupdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.album.alexflueras.ro/");
				
				WebElement people = driver.findElement(By.xpath("//a[text() = 'People']"));
				
				people.click();
				
				Thread.sleep(5000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("window.scrollBy(0,1000)");
				
	           
				
				Thread.sleep(5000);
				
				WebElement voilin = driver.findElement(By.xpath("//a[@id = 'a24']"));
				
		       //js.executeScript("arguments[0].scrollIntoView()", voilin);
		        
		 
				
				js.executeScript("arguments[0].click()", voilin);
				
				Thread.sleep(5000);
				
				TakesScreenshot ts = (TakesScreenshot) driver;
				
				File source = ts.getScreenshotAs(OutputType.FILE);
				
				File des = new File("C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\SS\\pic1.png");
				
				FileUtils.copyFile(source, des);
				
				Thread.sleep(3000);
				
				WebElement back = driver.findElement(By.xpath("//a[@id = 'back']"));
				
				back.click();
				
				
				
				
				
				
			
		

}
	
}
