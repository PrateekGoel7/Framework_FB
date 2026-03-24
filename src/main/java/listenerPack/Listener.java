package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	public void onTestStart() 
	{
		System.out.println("Test Started");
		
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Succeeded");
		System.out.println(result.getMethod().getMethodName());
		
	}
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Failed");
		System.out.println(result.getMethod().getMethodName());
		System.out.println(result.getThrowable());
	}

}
