package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
	public void testCase1()
	{
		Reporter.log("Testing of dropdown", true);
		
	}
	@Test
	public void testCase2()
	{
		Reporter.log("Testing of datePicker", true);
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}

}
