package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.omrbranch.pages.LoginPage;
import com.test.BaseClass1;

public class Sample extends BaseClass1 {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("CHROME");
		enterApplUrl("https://www.omrbranch.com/");
		maximizeWindow();
		implicitWait(60);

	}
	//@AfterClass
	//private void afterClass() {
		//closeWindow();

	//}
	
	@BeforeMethod
	
	private void beforeMethod() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

	}
	@AfterMethod
	private void afterMethod() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

	}
	
	
	//@Parameters({"username","password"})
	@Test(dataProvider="sample data",dataProviderClass = Hello.class)
	
	private void login( String userName,String password) {
		LoginPage loginpage=new LoginPage();
		loginpage.logIn(userName, password);
		

	}
	
	
	
	
	
	
	
	

}
