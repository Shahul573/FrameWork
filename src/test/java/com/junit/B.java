package com.junit;

import java.time.Duration;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	
	static WebDriver driver;
	
	@BeforeClass

	public static void beForeClass() {

		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	
@Test
	public void logIn() {
		
	WebElement txtMail = driver.findElement(By.id("email"));
	txtMail.sendKeys("crshahul11@gmail.com");
	
	String eMail = txtMail.getAttribute("value");
	Assert.assertEquals("verify email id textbox","crshahul11@gmail.com",eMail);
	
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("shahuL@1991");
	String pass = txtPass.getAttribute("value");
	Assert.assertEquals("verify password", "shahuL@1991",pass);
	
	WebElement clkLogin = driver.findElement(By.xpath("//button[text()='Login']"));
	clkLogin.click();

	
	WebElement txt = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
	String text = txt.getText();
	boolean contains = text.contains("Shahul");
	Assert.assertTrue("verify welcome message",contains);
	
	
	
	
	
	
	
	
	
	
	
	}

}
