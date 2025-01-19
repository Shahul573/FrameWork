package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.BaseClass1;

public class C extends BaseClass1 {
	
	
	@Parameters("browserName")
	
	@Test

	private void tc3(String browsername) {
		
		switch (browsername) {
		case "chrome":
			System.out.println("chrome");
			browserLaunch("CHROME");
			
			break;
			
		case "edge":
			System.out.println("edge");
			browserLaunch("EDGE");
			break;
			
		case "firefox":
			System.out.println("firefox");
			browserLaunch("FIREFOX");
			break;

		default:
			break;
		}
		
		
		maximizeWindow();
		enterApplUrl("https://adactinhotelapp.com/");
		
		closeWindow();
		
		

	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
