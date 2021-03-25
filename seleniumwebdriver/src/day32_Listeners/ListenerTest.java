package day32_Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(day32_Listeners.MyListener.class)
public class ListenerTest {
	
	@Test(priority=1)
	void test1()
	{
		Assert.assertEquals("A","A");
	}
	
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals("A","B");
	}
	
	@Test(priority=3,dependsOnMethods= {"test2"})
	void test3()
	{
		Assert.assertEquals("A","A");
	}


}
