package com.myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Branename {
	
	public static void main(String[] args) throws InterruptedException, NumberFormatException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");

		
		driver.manage().window().maximize();
	
		
		
	WebElement men = driver.findElement(By.xpath("//span[@class = 'product-discountedPrice']/ancestor::div[@class='product-productMetaInfo']/child::h3"));
	
	System.out.println(men.getText());

}
}