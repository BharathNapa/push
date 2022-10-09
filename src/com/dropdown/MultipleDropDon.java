package com.dropdown;

import java.nio.file.Path;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDon {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		
		driver.get("https://output.jsbin.com/osebed/2/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement s = driver.findElement(By.xpath("//select[@id = 'fruits']"));
		
	Select s1 = new Select(s);
	
	boolean multiple = s1.isMultiple();
	
	System.out.println(multiple);
	
	List<WebElement> options = s1.getOptions();
	
	int size = options.size();
	
	System.out.println(size);
	
	for(WebElement option : options) {
		
		System.out.println(option.getAttribute("value"));
		
		for(int i=0; i<=3; i++) {
			
			if(i==2 || i==3) {
				
				s1.selectByIndex(i);
			}
		}
	}
	
	List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
	
	for(WebElement option :allSelectedOptions) {
		
		System.out.println(option.getText());
	
	}

	WebElement option = s1.getFirstSelectedOption();
	
	String text = option.getText();
	
	System.out.println(text);
	
	
	s1.deselectByIndex(2);
	
	
}

}