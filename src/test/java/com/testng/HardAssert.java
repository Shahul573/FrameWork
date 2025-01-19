package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.omrbranch.pages.LoginPage;
import com.test.BaseClass1;

public class HardAssert extends BaseClass1 {

	@BeforeClass
	private void beforeClass() {
		browserLaunch("CHROME");
		enterApplUrl("https://www.omrbranch.com/");
		maximizeWindow();
		implicitWait(60);
		

	}

	@AfterClass
	private void afterClass() {
		closeWindow();

	}

	@Test

	private void tc1() {
		SoftAssert s=new  SoftAssert();
		s.assertTrue(getApplnUrl().contains("omrbranch"),"verify url");
		String actualTitle = getApplnTitle();
		s.assertEquals(actualTitle, "Home- thoraippakam OMR branch","verify title");

		LoginPage loginpage = new LoginPage();
		loginpage.logIn("crshahul11@gmail.com", "shahuL@1991");
		
		//to highlight assert failure
		s.assertAll();

	}

}
