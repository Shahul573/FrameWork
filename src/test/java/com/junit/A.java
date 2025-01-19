package com.junit;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static WebDriver driver;

	@BeforeClass

	public static void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	@Test

	public void login() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("shahul");

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("12345678");

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

	@After
	public void afterMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);

	}

	@Before

	public void beforeMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);

	}

	@AfterClass
	public static void afterClass() {
		driver.quit();

	}

}
