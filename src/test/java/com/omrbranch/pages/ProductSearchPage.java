package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass1;

public class ProductSearchPage extends BaseClass1 {
	
	public ProductSearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search")
	private WebElement txtSearch;
	
	@FindBy(xpath="(//a[@data-toggle='dropdown'])[1]")
	private WebElement msg;

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
		}

	public void searchProduct(String pName) {

		elementSendKeysEnter(txtSearch, pName);
	}

	public String getLoginSuccessMessageText() {
		String elementGetText = elementGetText(msg);
		return elementGetText;

	}
}
