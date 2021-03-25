package day32_Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener //extends TestListnerAdapter class and override the implementations according to our own project
{
	public void onTestStart(ITestResult result) 
	{
	    System.out.println("My test is started"+result.getName());
	  }
	
	public void onTestSuccess(ITestResult result)
	{
		 System.out.println("My test is passed"+result.getName());
	  }
	
	public void onTestFailure(ITestResult result) 
	{
	   System.out.println("My test has failed"+result.getName());
	  }
	
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("My test has skipped"+result.getName());
	  }


}
