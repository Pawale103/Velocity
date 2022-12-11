 package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
    @BeforeTest
    public void beforeTest()
    {
    	Reporter.log("before Test from Test1 class", true);
    }
    
    @AfterTest
    public void afterTest()
    {
     System.out.println("After test from Test1 class");
    }
	
	@Test
	public void testCase1()
	{
		Reporter.log("This is test case 1 from Test1 class", true);
		
	}
	@Test
	public void testCase2()
	{
		
		Reporter.log("This is test case 2 from Test1 class", true);
		
	}
	@Test
	public void testCase3()
	{
		Reporter.log("This is test case 3 from Test1 class", true);
		
		
	}

}
