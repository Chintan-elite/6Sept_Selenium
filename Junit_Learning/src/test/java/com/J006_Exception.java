package com;

import org.junit.Test;

public class J006_Exception {
	
	@Test(expected = Exception.class)
	public void test()
	{
		int i=0;
		int j = 10/i;
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test1()
	{
		int a[] = new int[5];
		a[6] = 10;
	}
	
}
