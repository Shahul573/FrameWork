package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceAutomationTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement txtMail = driver.findElement(By.id("email"));
		txtMail.sendKeys("crshahul11@gmail.com");

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("shahuL@1991");

		WebElement clkLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		clkLogin.click();

		Thread.sleep(3000);

		WebElement clkCatgories = driver.findElement(By.xpath("//a[text()='CATEGORIES ']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(clkCatgories).perform();

		WebElement clkGrocery = driver.findElement(By.xpath("//a[text()='Grocery']"));
		actions.moveToElement(clkGrocery).perform();

		Thread.sleep(3000);
		WebElement clkNuts = driver.findElement(By.xpath("//a[text()='Fruit & Nuts']"));
		clkNuts.click();

		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
		element.click();

		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.id("cart-53"));
		element2.click();

		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		element3.click();

		Thread.sleep(3000);
		WebElement element5 = driver.findElement(By.xpath("//div[@data-target='#addressModal']"));
		element5.click();

		Thread.sleep(3000);
		WebElement element4 = driver.findElement(By.id("address_type"));
		Select select = new Select(element4);
		select.selectByVisibleText("Home ");

		Thread.sleep(3000);
		WebElement txtName = driver.findElement(By.name("first_name"));
		txtName.sendKeys("Shahul");

		Thread.sleep(2000);
		WebElement txtLastName = driver.findElement(By.name("last_name"));
		txtLastName.sendKeys("Hameed");

		Thread.sleep(2000);
		WebElement txtPhn = driver.findElement(By.name("mobile"));
		txtPhn.sendKeys("8056692984");

		Thread.sleep(3000);
		WebElement txtHouseNo = driver.findElement(By.name("apartment"));
		txtHouseNo.sendKeys("6-47/8");

		Thread.sleep(3000);
		WebElement txtAddress = driver.findElement(By.name("address"));
		txtAddress.sendKeys("SwamiyarMadam,Kattathurai(po)");

		Thread.sleep(3000);
		WebElement element6 = driver.findElement(By.xpath("//select[@name='country']"));
		Select select1 = new Select(element6);
		select1.selectByVisibleText("India");

		Thread.sleep(2000);
		WebElement element7 = driver.findElement(By.name("state"));
		Select select2 = new Select(element7);
		select2.selectByValue("35");

		Thread.sleep(3000);
		WebElement element8 = driver.findElement(By.name("city"));
		Select select3 = new Select(element8);
		select3.selectByValue("3796");

		Thread.sleep(2000);
		WebElement element9 = driver.findElement(By.name("zipcode"));
		element9.sendKeys("629158");

		Thread.sleep(2000);
		WebElement clkSave = driver.findElement(By.xpath("(//button[text()='Save'])[3]"));
		clkSave.click();

		Thread.sleep(2000);
		WebElement clkPayment = driver.findElement(By.id("payment_type"));
		Select select4 = new Select(clkPayment);
		select4.selectByValue("debit_card");
		
		
		Thread.sleep(3000);
		WebElement btnClk = driver.findElement(By.xpath("//label[text()=' Visa ']"));
		btnClk.click();
		
		
		

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		//WebElement btnClk = wait
				//.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=' Visa ']")));
		//btnClk.click();
		// Thread.sleep(2000);

		// WebElement btnClk = driver.findElement(By.xpath("//input[@id =
		// 'visa_card']"));

		Thread.sleep(2000);
		WebElement txtCardNo = driver.findElement(By.name("card_no"));
		txtCardNo.sendKeys("5555555555552222");

		Thread.sleep(2000);
		WebElement slctMonth = driver.findElement(By.id("month"));
		Select select5 = new Select(slctMonth);
		select5.selectByValue("February");

		Thread.sleep(2000);
		WebElement slctYear = driver.findElement(By.id("year"));
		Select select6 = new Select(slctYear);
		select6.selectByValue("2025");

		Thread.sleep(2000);
		WebElement txtCvv = driver.findElement(By.name("cvv"));
		txtCvv.sendKeys("675");

		Thread.sleep(2000);
		WebElement clkOrder = driver.findElement(By.id("placeOrder"));

		clkOrder.click();

	}

}
