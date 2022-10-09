package com.dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCollection {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		
		driver.get("https://output.jsbin.com/osebed/2/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement s = driver.findElement(By.xpath("//select[@id = 'fruits']"));
		
	Select s1 = new Select(s);
	
	List<WebElement> options = s1.getOptions();
	
	
	List <String> ls = new ArrayList <> ();
	
for(WebElement allwords : options) {
	
	ls.add(allwords.getText());
}

System.out.println(ls);
	
	}

}
