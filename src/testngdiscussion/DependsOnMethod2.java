package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethod2 {
	
	@Test(priority=1,dependsOnMethods="testngdiscussion.DependsOnMethods.logout")
	public void navigateToModule2()
	{
		
	} 

}
