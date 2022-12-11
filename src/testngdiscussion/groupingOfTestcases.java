package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupingOfTestcases {
	@Test (groups="Sanity")
	public void navigateToUrl()
	{
		Reporter.log("Navigate to url Method",true);
	}
	
	@Test(groups="Regression")
	public void login()
	{
		//Assert.fail();
		Reporter.log("Login Method",true);
	}
	@Test(groups= {"Sanity","Regression"}) 
	public void dashboard()
	{
		Reporter.log("dashboard Method",true);
	}
	@Test(groups="Sanity",dependsOnMethods= {"navigateToUrl","login"})
	public void logout()
	{
		//Assert.fail();
		Reporter.log("logout Method",true);
	}


}
