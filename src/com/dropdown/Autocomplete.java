package com.dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		
		driver.get("https://www.google.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		js.executeScript("history.get(0))");
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		
		search.sendKeys("selenium");
		
     //Robot r = new Robot();
     
//     r.keyPress(KeyEvent.VK_DOWN);
//     r.keyRelease(KeyEvent.VK_DOWN);
//     
//     r.keyPress(KeyEvent.VK_DOWN);
//     r.keyRelease(KeyEvent.VK_DOWN);
		
		String text;
     
     do {
		search.sendKeys(Keys.ARROW_DOWN);
		
		text = search.getAttribute("value");
		
		System.out.println(text);
		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);

		if(text.equalsIgnoreCase("selenium grid")) {
			
			search.sendKeys(Keys.ENTER);
			
			break;
		} 
     
     }while(!text.isEmpty());

}
	
}
