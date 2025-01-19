package com.junit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOmr {

	static WebDriver driver;
	TakesScreenshot screenshot;

	@BeforeClass

	public static void beForeClass() {

		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@Before

	public void beforeMethod() throws IOException {
		screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWork\\sample\\Hello.png");
		FileUtils.copyFile(file, desFile);
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);

	}

	@Test

	public void logIn() {
		WebElement txtMail = driver.findElement(By.id("email"));
		txtMail.sendKeys("crshahul11@gmail.com");

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("shahuL@1991");

		WebElement clkLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		clkLogin.click();

	}

	@After
	public void afterMethod() throws IOException {
		screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWork\\sample\\SShot.png");
		FileUtils.copyFile(file, desFile);
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);

	}

	@AfterClass

	public static void afterclassMethod() {
		driver.quit();

	}

}
