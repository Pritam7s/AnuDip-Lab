package jUnitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitClass.class);
		for(Failure failure : result.getFailures()){
		    System.out.println("Result: "+failure.toString());
		} 
		System.out.println("Result: "+ result.wasSuccessful());
	}

}
