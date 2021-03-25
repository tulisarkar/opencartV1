package day29;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {
	
	@BeforeMethod()
	void login()
	{
		System.out.println("Log in...");
	}
	
	@AfterMethod()
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
