package com.xaxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	
    //Thread.sleep(4000);
	
	driver.manage().window().maximize();
	
	//self
	
	WebElement findElement = driver.findElement(By.xpath("//a[contains(text() , 'EIH Ltd.')]"));
	
	System.out.println(findElement.getText());
	
	//parent
	
	WebElement parent = driver.findElement(By.xpath("//a[contains(text() , 'EIH Ltd.')]/parent::td"));
	
	System.out.println(parent.getText());
	
	//child
	
	List<WebElement> size = driver.findElements(By.xpath("//a[contains(text(),'EIH Ltd.')]/ancestor::tr/child::td"));
	
	System.out.println(size.size());
	
	//Ancestor
	
	WebElement text = driver.findElement( By.xpath("//a[contains(text(),'EIH Ltd.')]/ancestor::tr"));
	
	System.out.println(text.getText());
	
	//Descendant
	
	List<WebElement> text1 = driver.findElements(By.xpath("//a[contains(text(),'EIH Ltd.')]/ancestor::tr/descendant::*"));
	System.out.println(text1.size());
	
	//Following
	
	List<WebElement> text2 = driver.findElements(By.xpath("//a[contains(text(),'EIH Ltd.')]/ancestor::tr/following::tr"));
	System.out.println(text2.size());
	
	//following-sibling
	
	List<WebElement> text3 = driver.findElements(By.xpath("//a[contains(text(),'EIH Ltd.')]/ancestor::tr/following-sibling::tr"));
	System.out.println(text3.size());
	
	//Preceding
	
	List<WebElement> text4 = driver.findElements(By.xpath("//a[contains(text(),'EIH Ltd.')]/ancestor::tr/preceding::tr"));
	System.out.println(text4.size());
	
	
	//Preceding-sibling
	
	List<WebElement> text5 = driver.findElements(By.xpath("//a[contains(text(),'EIH Ltd.')]/ancestor::tr/preceding-sibling::tr"));
	System.out.println(text5.size());
	
	
	}
}
