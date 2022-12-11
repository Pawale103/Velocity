package testngdiscussion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test (priority=1)
	public void navigateToUrl()
	{
		Reporter.log("Navigate to url Method",true);
	}
	
	@Test(priority=2)
	public void login()
	{
		//Assert.fail();
		Reporter.log("Login Method",true);
	}
	@Test(priority=3,dependsOnMethods="login")
	public void dashboard()
	{
		Reporter.log("dashboard Method",true);
	}
	@Test(priority=4,dependsOnMethods= {"navigateToUrl","login"})
	public void logout()
	{
		//Assert.fail();
		Reporter.log("logout Method",true);
	}

}
