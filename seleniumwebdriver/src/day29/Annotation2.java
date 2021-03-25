package day29;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeClass()//this method will execute once before execution of other methods
	void login()
	{
		System.out.println("Log in...");
	}
	
	@AfterClass()//this method will execute once after execution of other methods
	void logout()
	{
		System.out.println("Log out");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search....");
	}
	
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("Advanced Search...");
	}
	
	@Test(priority=3)
	void recharge()
	{
		System.out.println("Recharge....");
	}

}



