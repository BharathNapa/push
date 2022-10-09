package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com ");
		
		driver.manage().window().maximize();
		
		WebElement createaccount = driver.findElement(By.xpath("//a[text() = 'Create New Account']"));
		
		createaccount.click();
		
	Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.xpath("//select[@id = 'day']"));
		
		Select s = new Select(date);
		
		s.selectByValue("24");
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));
		
		Select s1 = new Select(month);
		
		s1.selectByIndex(1);
		
		WebElement year = driver.findElement(By.xpath("//select[@id = 'year']"));
		
		Select s2 = new Select(year);
		
    boolean multiple = s2.isMultiple();
        
        System.out.println(multiple);
		
		//s2.selectByVisibleText("1995");
        
		
    List<WebElement> options = s2.getOptions();
    
    int size = options.size();
    
    System.out.println(size);
    
    for(WebElement list : options) {
    	
    	System.out.println(list.getText());
    	
    	
    }
		
		
}

}