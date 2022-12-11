package testngdiscussion;

import org.testng.annotations.Test;

public class ExcludeAndIncludeMethods {
	
	
	@Test(priority=1)
	public void testOne()
	{
		System.out.println("This is testOne");
	}
	
	@Test(priority=2)
	public void testTwo()
	
	{
		System.out.println("This is testTwo");
	}
	@Test(priority=3)
    public void testThree()
    {
		System.out.println("This is testThree");
    }
}
