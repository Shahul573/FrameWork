package com.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class B {

	@Test
	private void test1() {
		System.out.println("test1");
	}

	@Test
	private void test2() {
		System.out.println("test2");
	}

	@Test
	private void test3() {
		Assert.assertTrue(false);
		System.out.println("test3");
	}

	@Test
	private void test4() {
		Assert.assertTrue(false);
		System.out.println("test4");
	}

	@Test
	private void test5() {
		System.out.println("test5");
	}

}
