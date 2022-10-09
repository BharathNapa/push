package com.myntra;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMultiple {
	
	public static void main(String[] args) throws InterruptedException, NumberFormatException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.myntra.com/");

	
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	
	
	
WebElement men = driver.findElement(By.xpath("(//a[@class  = 'desktop-main'])[1]"));
	
WebElement tshirts = driver.findElement(By.xpath("(//a[@class  = 'desktop-categoryLink'])[1]"));
	

act.moveToElement(men).build().perform();

act.moveToElement(tshirts).click().build().perform();

Set<Integer> list = new HashSet<Integer>();


for(int i=1; i<2; i++) {

List<WebElement> allprice = driver.findElements(By.xpath("//ul[@class='results-base']/descendant::span[@class='product-discountedPrice']"));

Thread.sleep(4000);

for(WebElement price : allprice) {
	
	
	
 String text = price.getText();
 
 String replaceAll = text.replaceAll("Rs. ", "");
 
 int parseInt = Integer.parseInt(replaceAll);
 
 list.add(parseInt);
}

Thread.sleep(3000);
WebElement clk = driver.findElement(By.xpath("//li[@class='pagination-next']/child::a"));

clk.click();

}

Integer min = Collections.min(list);

System.out.println(min);

}
	
}
