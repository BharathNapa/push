package com.autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdN8XDupq1CGVi6Se9hoGsF9MAHmH-EM2ZSBC3KIJ_4bfGpyw/formResponse");
		
		driver.manage().window().maximize();
		
		WebElement clk = driver.findElement(By.xpath("//span[text()='Next']"));
		
		clk.click();
	}

}
