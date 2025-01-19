package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hello {

	@Test(dataProvider = "sample data")

	private void login(String x, String y) {
		System.out.println(x);
		System.out.println(y);

	}

	@DataProvider(name = "sample data")

	public Object[][] datas() {

		Object[][] obj = new Object[][] { { "bala@gmail.com", "bala@123" }, { "arun@gmail.com", "arun@123" },
				{ "guna@gmail.com", "guna@123" }, { "crshahul11@gmail.com", "shahuL@1991" } };
		return obj;

	}

//	@Test(enabled = false)
//	private void searchHotel() {
//
//	}
//
//	@Test(invocationCount = 10)
//	private void selectHotel() {
//
//	}
//
//	@Test
//	private void bookHotel() {
//
//	}
//
//	@Test
//	private void bookingConformation() {
//
//	}

}
