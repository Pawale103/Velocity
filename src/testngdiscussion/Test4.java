package testngdiscussion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void testCase1()
	{
		Reporter.log("This is test case 1 from Test4 class", true);
		
	}
	@Test
	public void testCase2()
	{
		Assert.assertEquals(true, true);
		Reporter.log("This is test case 2 from Test4 class", true);
		
	}
	@Test(enabled=false,priority=0)
	public void testCase3()
	{
		Reporter.log("This is test case 3 from Test4 class", true);
		
		
	}
	@Test
	public void testCase4()
	{
		Assert.assertTrue(true,"Condition should be true in Assert.assertTrue");
		Assert.assertFalse(false,"condition should be fails in Assert.assertFalse");
	}
	@Test
	public void testCase5()
	{
		Assert.fail("Deliberately failing the Test case 5");
	}
	

}
