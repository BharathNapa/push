package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xaxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		
		WebElement search = driver.findElement(By.xpath("//input [@id = 'twotabsearchtextbox']"));	
		
		search.sendKeys("shirts for men");
		
		
		WebElement clk = driver.findElement(By.xpath("//input[@type= 'submit']"));
		
		clk.click();
		
	  Thread.sleep(20000);
		
		WebElement tshirt = driver.findElement(By.xpath("(//span[@data-a-size= 'l'])[1]//preceding::h5[@class='s-line-clamp-1']"));
	
		System.out.println(tshirt.getText());	
		
		
		
	}





}