package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions (driver);
		
		
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement city = driver.findElement(By.xpath("//div[@id = 'box7']"));
		
		WebElement country = driver.findElement(By.xpath("//div[@id = 'box107']"));
		
		act.dragAndDrop(city, country).build().perform();
		
	
		
		WebElement city1 = driver.findElement(By.xpath("//div[@id = 'box3']"));
		
		WebElement country1 = driver.findElement(By.xpath("//div[@id = 'box103']"));
		
		act.dragAndDrop(city1, country1).build().perform();
		
	}

}
