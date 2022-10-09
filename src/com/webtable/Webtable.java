package com.webtable;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/table.html");
	
Thread.sleep(4000);
	
	driver.manage().window().maximize();
	
	 List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
	 
	 for (WebElement data : alldata) {
		 
		 System.out.println(data.getText());
		 
		 
		 
		}
	 
	 System.out.println("-------------------------");
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	 
	 List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	
	 for (WebElement row : rows) {
		 
		 System.out.println(row.getText());
		
	}
	 
	 System.out.println("-------------------------");
	
	 List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
	 for (WebElement col : cols) {
		 
		 System.out.println(col.getText());
		
	}
	 
	 System.out.println("-------------------------");
		
	 List<WebElement> rolandcol = driver.findElements(By.xpath("//table/tbody/tr[2]/td[2]"));
		
	 for (WebElement rolandcols : rolandcol) {
		 
		 System.out.println(rolandcols.getText());
	}
	
	 WebElement click = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
	 
	 click.click();
	
}
	
}