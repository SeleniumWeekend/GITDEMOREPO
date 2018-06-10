package com.listener123;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Test1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		logger(result.getName()+" : Starting");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger(result.getName()+" : PASS");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		logger(result.getName()+" : FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		logger(result.getName()+" : SKIPPED");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		logger(result.getName()+" : FAILED With Some Success Percentage");
	}

	@Override
	public void onStart(ITestContext context) 
	{
		logger(context.getName()+" : Started");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		logger(context.getName()+" : FINISHED");
	}
	
	private void logger(String s)
	{
		Reporter.log(s);
	}
	
	
	
}
