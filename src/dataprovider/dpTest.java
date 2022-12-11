package dataprovider;

import org.testng.annotations.Test;

public class dpTest {
	
	
	@Test(dataProvider="testdata",dataProviderClass=dataprovider.dataProviderClass.class)
	public void testcase(String username,String password)
	{
		System.out.println("Username is:"+username +"password is:"+password); 
	}

}
