package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass1;

public class LoginPage extends BaseClass1 {
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="email")	
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void logIn(String userName,String passWord) {
		elementSendKeys(txtEmail,userName );
		elementSendKeys(txtPass, passWord);
		elementClick(btnLogin);
		

	}
	
	
	
}
