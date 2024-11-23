package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:/www.omrbranch.com/");
		
	WebElement name = driver.findElement(By.id("email"));
	name.sendKeys("shahul");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("123456");
	
	WebElement btn = driver.findElement(By.xpath("//button[text()='Login']"));
	btn.click();
	driver.quit();
	
		
	}

}
