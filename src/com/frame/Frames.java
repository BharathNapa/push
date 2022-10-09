package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
//		WebElement sf = driver.findElement(By.xpath("(//a[@class= 'analystic'])[1]"));
//		
//		sf.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name= 'SingleFrame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement name = driver.findElement(By.xpath("(//input[@type= 'text'])[1]"));
		
		name.sendKeys("Bharath");
		
		
		
		Thread.sleep(3000);
		
		// driver.switchTo().parentFrame();
		
       WebElement web = driver.findElement(By.xpath("//a[text() = 'WebTable']"));
       		
		web.click();
		
		WebElement mf = driver.findElement(By.xpath("//a[text() = 'Iframe with in an Iframe']"));
		
		mf.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src = 'SingleFrame.html'])[1]"));
		
	    driver.switchTo().frame(innerframe);
	    
      WebElement name1 = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
		
		name1.sendKeys("Bharath");
		
		Thread.sleep(3000);
		
		
		
		
	}
}
