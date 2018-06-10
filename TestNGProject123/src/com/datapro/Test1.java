package com.datapro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1
{
	@Test(dataProvider="test")
	public void m1(String data1)
	{
		System.out.println(data1);
	}
	int i=0;
	@DataProvider(name="test")
	public Object[][] data()
	{	
		Object[][] o1 = null;
		String un= Excel.getData("Sheet1", 2, 6);
		String[] data1 = un.split("#");
		
		String pw= Excel.getData("Sheet1", 2, 7);
		String[] data2 = pw.split("#");
		
		for(i=0; i<=data1.length-1; i++)
		{
			o1= new Object[][]{{data1[i]+" , "+data2[i]}};
		}
		return o1;
		
	}
}
