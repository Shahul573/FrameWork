package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass1;

public class MyCartPage extends BaseClass1 {

	public MyCartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@data-target='#addressModal']")
	private WebElement clickAddress;

	@FindBy(id = "address_type")
	private WebElement slctHome;

	@FindBy(name = "first_name")
	private WebElement txtFirstName;

	@FindBy(name = "last_name")
	private WebElement txtLastName;

	@FindBy(name = "mobile")
	private WebElement txtNumber;

	@FindBy(name = "apartment")
	private WebElement txtHouseNo;

	@FindBy(name = "address")
	private WebElement txtAddress;

	@FindBy(xpath = "//select[@name='country']")
	private WebElement slctCountry;

	@FindBy(name = "state")
	private WebElement slctState;

	@FindBy(name = "city")
	private WebElement slctCity;

	@FindBy(name = "zipcode")
	private WebElement txtZipCode;

	@FindBy(xpath = "(//button[text()='Save'])[3]")
	private WebElement clkSave;

	@FindBy(id = "payment_type")
	private WebElement slctPayment;

	@FindBy(xpath = "//label[text()=' Visa ']")
	private WebElement clkVisa;

	@FindBy(name = "card_no")
	private WebElement txtCardNo;

	@FindBy(id = "month")
	private WebElement slctMnth;

	@FindBy(id = "year")
	private WebElement slctYr;

	@FindBy(name = "cvv")
	private WebElement txtCvv;

	@FindBy(id = "placeOrder")
	private WebElement clkOrder;

	@FindBy(xpath = "//h5[text()='My Cart']")
	private WebElement getMyCartText;

	@FindBy(xpath = "//div[text()='Delivery Address']")
	private WebElement getDeleveryAddress;

	@FindBy(xpath = "//div[text()='  Payment Method ']")
	private WebElement getPaymentMethodText;

	public WebElement getGetDeleveryAddress() {
		return getDeleveryAddress;
	}

	public WebElement getGetPaymentMethodText() {
		return getPaymentMethodText;
	}

	public WebElement getGetMyCartText() {
		return getMyCartText;
	}

	public WebElement getClickAddress() {
		return clickAddress;
	}

	public WebElement getSlctHome() {
		return slctHome;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtNumber() {
		return txtNumber;
	}

	public WebElement getTxtHouseNo() {
		return txtHouseNo;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getSlctCountry() {
		return slctCountry;
	}

	public WebElement getSlctState() {
		return slctState;
	}

	public WebElement getSlctCity() {
		return slctCity;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getClkSave() {
		return clkSave;
	}

	public WebElement getSlctPayment() {
		return slctPayment;
	}

	public WebElement getClkVisa() {
		return clkVisa;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getSlctMnth() {
		return slctMnth;
	}

	public WebElement getSlctYr() {
		return slctYr;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getClkOrder() {
		return clkOrder;
	}

	public void myCart(String adres, String firstname, String lastname, String phnno, String houseno, String address,
			String country, String state, String city, String code, String payment, String cardno, String month,
			String year, String cvvno) throws InterruptedException {

		elementClick(clickAddress);
		Thread.sleep(2000);
		selectOptionByText(slctHome, adres);
		elementSendKeys(txtFirstName, firstname);
		elementSendKeys(txtLastName, lastname);
		elementSendKeys(txtNumber, phnno);
		elementSendKeys(txtHouseNo, houseno);
		elementSendKeys(txtAddress, address);
		selectOptionByText(slctCountry, country);
		selectOptionByValue(slctState, state);
		selectOptionByValue(slctCity, city);
		elementSendKeys(txtZipCode, code);
		elementClick(clkSave);
		Thread.sleep(2000);
		selectOptionByValue(slctPayment, payment);
		Thread.sleep(2000);
		elementClick(clkVisa);
		elementSendKeys(txtCardNo, cardno);
		selectOptionByValue(slctMnth, month);
		selectOptionByValue(slctYr, year);
		elementSendKeys(txtCvv, cvvno);
		elementClick(clkOrder);

	}

	public String getMyCarttext() {
		String elementGetText = elementGetText(getMyCartText);
		return elementGetText;

	}

	public String getDeleveryaddress() {
		String elementGetText = elementGetText(getDeleveryAddress);
		return elementGetText;

	}

	public String getPaymentText() {
		String elementGetText = elementGetText(getPaymentMethodText);
		return elementGetText;

	}

}
