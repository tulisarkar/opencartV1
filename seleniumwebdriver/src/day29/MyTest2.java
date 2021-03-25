package day29;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest2 {
	@Test(priority=3)
	void test3()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	void test4()
	{
		Assert.assertTrue(false);
	}


}
