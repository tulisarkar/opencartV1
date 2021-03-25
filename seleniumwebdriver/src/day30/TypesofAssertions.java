package day30;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TypesofAssertions {
	//@Test
		void test_hardAssertions()
		{
			Assert.assertEquals("abc","xyz");   //Failed
			System.out.println("Hard assertions completed..."); // This statement will not execute
		}
		
		@Test
		void test_softAssertions()
		{
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(123,321);  //Failed
			System.out.println("Softassertion completed");  //This statement will execute
		
			sa.assertAll(); //Required to fail soft assertions at the end of the script
		}
		

}
