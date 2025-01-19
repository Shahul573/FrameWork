package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		

		WebElement txtMail = driver.findElement(By.id("email"));
		txtMail.sendKeys("crshahul11@gmail.com");

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("shahuL@1991");

		WebElement clkLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		clkLogin.click();
		Thread.sleep(5000);

		WebElement clkCatgories = driver.findElement(By.xpath("//a[text()='CATEGORIES ']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(clkCatgories).perform();

		Thread.sleep(2000);
		WebElement clkGrocery = driver.findElement(By.xpath("//a[text()='Grocery']"));
		actions.moveToElement(clkGrocery).perform();

		Thread.sleep(2000);
		WebElement clkNuts = driver.findElement(By.xpath("//a[text()='Fruit & Nuts']"));
		clkNuts.click();

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
		element.click();

		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.id("cart-53"));
		element2.click();
		Thread.sleep(3000);

		WebElement element3 = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		element3.click();

		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.xpath("//div[@data-target='#addressModal']"));
		element5.click();

		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.id("address_type"));
		Select select = new Select(element4);
		select.selectByVisibleText("Home ");

		Thread.sleep(2000);
		WebElement txtName = driver.findElement(By.name("first_name"));
		txtName.sendKeys("Shahul");

		WebElement txtLastName = driver.findElement(By.name("last_name"));
		txtLastName.sendKeys("Hameed");

		WebElement txtPhn = driver.findElement(By.name("mobile"));
		txtPhn.sendKeys("8056692984");

		WebElement txtHouseNo = driver.findElement(By.name("apartment"));
		txtHouseNo.sendKeys("6-47/8");

		Thread.sleep(2000);
		WebElement txtAddress = driver.findElement(By.name("address"));
		txtAddress.sendKeys("SwamiyarMadam,Kattathurai(po)");

		Thread.sleep(2000);
		WebElement element6 = driver.findElement(By.xpath("//select[@name='country']"));
		Select select1 = new Select(element6);
		select1.selectByVisibleText("India");

		Thread.sleep(2000);
		WebElement element7 = driver.findElement(By.name("state"));
		Select select2 = new Select(element7);
		select2.selectByValue("35");

		Thread.sleep(2000);
		WebElement element8 = driver.findElement(By.name("city"));
		Select select3 = new Select(element8);
		select3.selectByValue("3796");

		Thread.sleep(2000);
		WebElement element9 = driver.findElement(By.name("zipcode"));
		element9.sendKeys("629151");

		Thread.sleep(2000);
		WebElement clkSave = driver.findElement(By.xpath("(//button[text()='Save'])[3]"));
		clkSave.click();

		Thread.sleep(2000);

		WebElement clkOrder = driver.findElement(By.id("placeOrder"));
		clkOrder.click();

	}

}
