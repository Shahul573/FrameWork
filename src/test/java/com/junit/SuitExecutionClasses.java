package com.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SampleTest1.class,Sample2.class})


public class SuitExecutionClasses {
public static void main(String[] args) {
	
	Result r = JUnitCore.runClasses(SuitExecutionClasses.class);
	int runCount = r.getRunCount();
	System.out.println("Total method executed:"+runCount);
	
	int ignoreCount = r.getIgnoreCount();
	System.out.println("Total method ignored:"+ignoreCount);
	
	int failureCount = r.getFailureCount();
	System.out.println("Total method failed:"+failureCount);
	
	//to get the name of failed method
	
	List<Failure> failures = r.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

}

	


