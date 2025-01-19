package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrTest extends BaseClass1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		OmrTest test = new OmrTest();
		test.createorderId();

	}

	public void createorderId() throws IOException, InterruptedException {
		// WebDriver driver = new ChromeDriver();
		browserLaunch("CHROME");

		// driver.manage().window().maximize();
		maximizeWindow();

		// driver.get("https://www.omrbranch.com/");
		enterApplUrl("https://www.omrbranch.com/");

		Thread.sleep(2000);
		// WebElement txtMail = driver.findElement(By.id("email"));
		WebElement txtEmail = findLocatorById("email");

		elementSendKeys(txtEmail, getCellData("OMR", 1, 5));

		Thread.sleep(2000);
		WebElement txtPass = findLocatorById("pass");
		elementSendKeys(txtPass, getCellData("OMR", 1, 6));

		Thread.sleep(2000);
		WebElement btnLogin = findLocatorByXpath("//button[text()='Login']");
		elementClick(btnLogin);

		Thread.sleep(2000);
		WebElement clkCatogeries = findLocatorByXpath("//a[text()='CATEGORIES ']");
		mouseOverActions(clkCatogeries);

		Thread.sleep(2000);
		WebElement clkGrocery = findLocatorByXpath("//a[text()='Grocery']");
		mouseOverActions(clkGrocery);

		Thread.sleep(2000);
		WebElement clkNuts = findLocatorByXpath("//a[text()='Fruit & Nuts']");
		elementClick(clkNuts);

		Thread.sleep(2000);
		WebElement element = findLocatorByXpath("(//a[text()='Add'])[1]");
		elementClick(element);

		Thread.sleep(2000);
		WebElement element2 = findLocatorById("cart-53");
		elementClick(element2);

		Thread.sleep(1000);
		WebElement element3 = findLocatorByXpath("//a[text()=' Go To Cart ']");
		elementClick(element3);

		Thread.sleep(2000);
		WebElement element4 = findLocatorByXpath("//div[@data-target='#addressModal']");
		elementClick(element4);

		Thread.sleep(2000);
		WebElement element5 = findLocatorById("address_type");
		selectOptionByText(element5, "Home ");

		Thread.sleep(2000);
		WebElement element6 = findLocatorByName("first_name");
		elementSendKeys(element6, getCellData("OMR", 1, 0));

		Thread.sleep(2000);
		WebElement element7 = findLocatorByName("last_name");
		elementSendKeys(element7, getCellData("OMR", 1, 1));

		Thread.sleep(2000);
		WebElement txtPhn = findLocatorByName("mobile");
		elementSendKeys(txtPhn, getCellData("OMR", 1, 2));

		Thread.sleep(2000);
		WebElement txtHouseNo = findLocatorByName("apartment");
		elementSendKeys(txtHouseNo, getCellData("OMR", 1, 3));

		Thread.sleep(2000);
		WebElement txtAddress = findLocatorByName("address");
		elementSendKeys(txtAddress, getCellData("OMR", 1, 4));

		Thread.sleep(2000);
		WebElement element8 = findLocatorByXpath("//select[@name='country']");
		selectOptionByText(element8, "India");

		Thread.sleep(2000);
		WebElement element9 = findLocatorByName("state");
		selectOptionByValue(element9, "35");

		Thread.sleep(2000);
		WebElement city = findLocatorByName("city");
		selectOptionByValue(city, "3796");

		Thread.sleep(2000);
		WebElement code = findLocatorByName("zipcode");
		elementSendKeys(code, getCellData("OMR", 1, 7));

		Thread.sleep(2000);
		WebElement clkSave = findLocatorByXpath("(//button[text()='Save'])[3]");
		elementClick(clkSave);

		Thread.sleep(2000);
		WebElement clkPayment = findLocatorById("payment_type");
		selectOptionByValue(clkPayment, "debit_card");

		Thread.sleep(2000);
		WebElement btnClk = findLocatorByXpath("//label[text()=' Visa ']");
		elementClick(btnClk);

		Thread.sleep(2000);
		WebElement txtCardNo = findLocatorByName("card_no");
		elementSendKeys(txtCardNo, getCellData("OMR", 1, 8));

		Thread.sleep(3000);
		WebElement slctMonth = findLocatorById("month");
		selectOptionByValue(slctMonth, "February");

		Thread.sleep(2000);
		WebElement slctYear = findLocatorById("year");
		selectOptionByValue(slctYear, "2025");

		Thread.sleep(2000);
		WebElement txtCvv = findLocatorByName("cvv");
		elementSendKeys(txtCvv, getCellData("OMR", 1, 9));

		// Thread.sleep(3000);
		WebElement clkOrder = findLocatorById("placeOrder");
		elementClick(clkOrder);
		
		createCellAndSetData("OMR", 1, 10, "488754");
	}

}
