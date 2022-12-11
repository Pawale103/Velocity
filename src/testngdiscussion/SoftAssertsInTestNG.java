package testngdiscussion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsInTestNG {
	
	
	@Test
	public void testCaseNew()
	{
		SoftAssert sa= new SoftAssert();
		System.out.println("Before assertion");
		sa.assertEquals(true, false);
		//it will fail the test case but it will execute the remaining commands.
		System.out.println("After assertion");
		sa.assertAll();
		
		
	}

}
