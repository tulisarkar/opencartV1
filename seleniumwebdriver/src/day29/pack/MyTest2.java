package day29.pack;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MyTest2 {
	@Test(priority=3)
	void test3()
	{
		//Assert.assertTrue(true);
		System.out.println("This is test3 from My Test2");
	}
	
	@Test(priority=4)
	void test4()
	{
		//Assert.assertTrue(false);
		System.out.println("This is test4 from My Test2");
	}
	@AfterTest
	void n()
	{
		System.out.println("This is after test method");
	}


}
