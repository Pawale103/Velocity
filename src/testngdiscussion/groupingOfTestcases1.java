package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupingOfTestcases1 {
	
	
	@Test(groups="addhoc")
	public void Test1()
	{
		Reporter.log("This is Test1 Method",true);
	}

}
