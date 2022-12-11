package testngdiscussion;

import org.testng.annotations.Test;

public class RunningTestCaseMultipleTimes {
	
	
	@Test(invocationCount=5)// if we want to run test cases multiple times then invocationCount=number in given
	public void Task1()
	{
		System.out.println("Running test case multiple times");
	}

}
