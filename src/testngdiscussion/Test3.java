package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void testCase1()
	{
		Reporter.log("This is test case 1 from Test3 class", true);
		
	}
	@Test
	public void testCase2()
	{
		
		Reporter.log("This is test case 2 from Test3 class", true);
		
	}
	@Test
	public void testCase3()
	{
		Reporter.log("This is test case 3 from Test3 class", true);
		
		
	}

}
