package day29;

import org.testng.annotations.*;


public class AllAnnotations {
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test method");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is after test method");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is before  method");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is after method");
	}
	
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is before class ");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is after class");
	}
	
	@Test
	void m()
	{
		System.out.println("m");
	}
	

}
