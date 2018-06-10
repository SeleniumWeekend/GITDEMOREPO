package com.listener123;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Test1.class)
public class Test2 
{
	@Test
	public void m1()
	{
		System.out.println("M1 Start");
		Assert.assertTrue(false);
		System.out.println("M1 End");
	}
	
	@Test
	public void m2()
	{
		System.out.println("M2 Start");
		System.out.println("M2 End");
	}
	
}
