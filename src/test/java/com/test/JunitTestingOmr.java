package com.test;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JunitTestingOmr extends BaseClass1 {

	static WebDriver driver;
	Actions actions;
	Select select;

	@BeforeClass
	public static void beforeClass() {

		browserLaunch("CHROME");
		enterApplUrl("https://www.omrbranch.com/");
		maximizeWindow();
		implicitWait(60);
	}

	// @AfterClass
	// public static void afterClass() {
	// closeWindow();

	// }

	@Test
	public void createOrderId() throws IOException, InterruptedException {
		WebElement txtEmail = findLocatorById("email");
		elementSendKeys(txtEmail, getCellData("OMR", 1, 5));

		WebElement txtPass = findLocatorById("pass");
		elementSendKeys(txtPass, getCellData("OMR", 1, 6));

		WebElement btnLogin = findLocatorByXpath("//button[text()='Login']");
		elementClick(btnLogin);

		WebElement txt = findLocatorByXpath("(//a[@data-toggle='dropdown'])[1]");
		String text = txt.getText();
		boolean contains = text.contains("Shahul");
		Assert.assertTrue("verify welcome message", contains);

		WebElement clkCatogeries = findLocatorByXpath("//a[text()='CATEGORIES ']");
		mouseOverActions(clkCatogeries);

		WebElement clkGrocery = findLocatorByXpath("//a[text()='Grocery']");
		mouseOverActions(clkGrocery);

		WebElement clkNuts = findLocatorByXpath("//a[text()='Fruit & Nuts']");
		elementClick(clkNuts);

		WebElement nuts = findLocatorByXpath("//h5[text()='Fruit & Nuts']");
		String text2 = nuts.getText();
		boolean contains2 = text2.contains("Nuts");
		Assert.assertTrue("verify product msg", contains2);

		WebElement element = findLocatorByXpath("(//a[text()='Add'])[1]");
		elementClick(element);

		WebElement element2 = findLocatorById("cart-53");
		elementClick(element2);

		Thread.sleep(3000);
		WebElement element3 = findLocatorByXpath("//a[text()=' Go To Cart ']");
		elementClick(element3);

		WebElement cart = findLocatorByXpath("//h5[text()='My Cart']");
		String text3 = cart.getText();
		boolean contains3 = text3.contains("My Cart");
		Assert.assertTrue("verify shown the my cart text", contains3);

		WebElement element4 = findLocatorByXpath("//div[@data-target='#addressModal']");
		elementClick(element4);

		Thread.sleep(3000);
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

		WebElement element9 = findLocatorByName("state");
		selectOptionByValue(element9, "35");

		Thread.sleep(2000);
		WebElement city = findLocatorByName("city");
		selectOptionByValue(city, "3796");

		Thread.sleep(2000);
		WebElement code = findLocatorByName("zipcode");
		elementSendKeys(code, getCellData("OMR", 1, 7));
		WebElement clkSave = findLocatorByXpath("(//button[text()='Save'])[3]");
		elementClick(clkSave);

		Thread.sleep(2000);
		WebElement address = findLocatorByXpath("//div[text()='Delivery Address']");
		String text4 = address.getText();
		boolean contains4 = text4.contains("Address");
		Assert.assertTrue("verify shown the delivery address ", contains4);

		Thread.sleep(2000);
		WebElement payment = findLocatorByXpath("//div[text()='  Payment Method ']");
		String text5 = payment.getText();
		boolean contains5 = text5.contains("Payment Method");
		Assert.assertTrue("verify shown the payment method text", contains5);

		WebElement clkPayment = findLocatorById("payment_type");
		selectOptionByValue(clkPayment, "debit_card");

		Thread.sleep(2000);
		WebElement btnClk = findLocatorByXpath("//label[text()=' Visa ']");
		elementClick(btnClk);

		Thread.sleep(2000);
		WebElement txtCardNo = findLocatorByName("card_no");
		elementSendKeys(txtCardNo, getCellData("OMR", 1, 8));

		Thread.sleep(2000);
		WebElement slctMonth = findLocatorById("month");
		selectOptionByValue(slctMonth, "February");

		Thread.sleep(2000);
		WebElement slctYear = findLocatorById("year");
		selectOptionByValue(slctYear, "2025");

		Thread.sleep(2000);
		WebElement txtCvv = findLocatorByName("cvv");
		elementSendKeys(txtCvv, getCellData("OMR", 1, 9));

		Thread.sleep(2000);
		WebElement clkOrder = findLocatorById("placeOrder");
		elementClick(clkOrder);
		
		createCellAndSetData("OMR", 1, 10, "126334");

	}

}
