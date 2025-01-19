package com.junit;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.omrbranch.pages.LoginPage;
import com.omrbranch.pages.MyCartPage;
import com.omrbranch.pages.ProductListingPage;
import com.omrbranch.pages.ProductSearchPage;
import com.test.BaseClass1;

public class PomSample extends BaseClass1 {

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

		// Login
		LoginPage loginpage = new LoginPage();
		loginpage.logIn(getCellData("OMR", 1, 5), getCellData("OMR", 1, 6));

		// verify after login success message
		ProductSearchPage productsearchpage = new ProductSearchPage();
		String loginSuccessMessageText = productsearchpage.getLoginSuccessMessageText();
		Assert.assertEquals("verify success message", "Welcome Shahul", loginSuccessMessageText);

		// search product
		productsearchpage.searchProduct(getCellData("OMR", 1, 11));

		// verify search product message
		ProductListingPage productlist = new ProductListingPage();
		String searchProductMessage = productlist.getSearchProductMessage();
		Assert.assertEquals("verify after search product name message text", "Search Result - nuts",
				searchProductMessage);

		// add product in to cart
		productlist.goToCart();

		// add the address and verify it
		MyCartPage cartpage = new MyCartPage();
		String myCarttext = cartpage.getMyCarttext();
		Assert.assertEquals("verify shown the my cart text", "My Cart", myCarttext);

		String deleveryaddress = cartpage.getDeleveryaddress();
		Assert.assertEquals("verify shown the delevery address text", "Delivery Address", deleveryaddress);

		String paymentText = cartpage.getPaymentText();
		Assert.assertEquals("verify shown the payment method text", "Payment Method", paymentText);

		cartpage.myCart("Home ", getCellData("OMR", 1, 0), getCellData("OMR", 1, 1), getCellData("OMR", 1, 2),
				getCellData("OMR", 1, 3), getCellData("OMR", 1, 4), "India", "35", "3796", getCellData("OMR", 1, 7),
				"debit_card", getCellData("OMR", 1, 8), "February", "2025", getCellData("OMR", 1, 9));
		enterApplUrl("https://www.omrbranch.com/");
	}

}
