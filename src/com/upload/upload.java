package com.upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		
		// send keys works only with (type = file ) attribute in webpage and input tag
		
		
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		
		
//		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\lenovo\\Desktop\\My Resume\\BharathNap");
//		
		WebElement clk = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		
		
		///driver.switchTo().frame(clk);
		
		//clk.click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		
//		js.executeScript("arguments[0].click();",clk);
		
		Robot r = new Robot();
		
		r.delay(5000);
		
		StringSelection ss = new StringSelection("C:\\Users\\lenovo\\Desktop\\My Resume\\BharathNap.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
