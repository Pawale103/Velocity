package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicTest {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("This is test case 2");
		
	}
	@Test(priority=3)
	public void homePage()
	{
		
	}
	@Test(priority=1)                                     // default priority of test cases is always zero 
	public void navigateToUrl() throws Exception          //priority can be duplicate and minus
	{ 
		Reporter.log("Test cases is Navigating to url", true);// Reporter is class and log is static method. 
		                                                      //attaching this massage in the report and true is for printing in the console.
		System.out.println("Navigate To url TestCase");    // if priority is not given to any test cases then it will execute alphabetically 
	}

	

}
