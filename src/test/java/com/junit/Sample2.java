package com.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Sample2 {
	@Test
	public void tc01() {
		System.out.println("method 1");
	}

	@Test
	public void tc02() {
		System.out.println("method 2");
	}

	@Test
	public void tc03() {
		System.out.println("method 3");
	}

	@Test
	public void tc04() {
		
		Assert.assertTrue(false);
		System.out.println("method 4");
	}

	@Ignore
	@Test
	public void tc05() {
		System.out.println("method 5");
	}

}
