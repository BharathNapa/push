package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SeleniumPracice\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement simple = driver.findElement(By.xpath("//button[@onclick = 'alertbox()']"));		
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement confirm = driver.findElement(By.xpath("//a[text() = 'Alert with OK & Cancel ']"));
		
		confirm.click();
		
		//Thread.sleep(3000);
		
		WebElement confirmbox = driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']"));
		
		
		Alert alert1 = driver.switchTo().alert();
		
		alert1.dismiss();
		
		Thread.sleep(3000);
		
		WebElement alertbox = driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']"));
		
		alertbox.click();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick = 'promptbox()']"));
		
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.sendKeys("Bharath");
		
		alert2.accept();
		
	//	System.out.println(alert2.getText());
//		String text = alert2.getText();
//		
//		System.out.println(text);
		
		
}

}
