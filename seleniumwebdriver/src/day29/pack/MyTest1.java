package day29.pack;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest1 {
	@Test(priority=1)
	void test1()
	{
		//Assert.assertTrue(true);
		System.out.println("This is test1 from MyTest1");
	}
	
	@Test(priority=2)
	void test2()
	{
		Assert.assertTrue(false);
		System.out.println("This is test2 from MyTest1");
	}
	@BeforeTest
void m()
{
	System.out.println("This is before test method");
}

}
