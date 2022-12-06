package com;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class J001_AssertDemo {
	
	@Test
	public void test()
	{
		//assertEquals(10, 10);
		//assertTrue(10>20);
		//assertFalse(10>20);
		//assertNull(null);
		//assertNotNull(null);
		
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50,5};
		
		assertArrayEquals(a, b);
		
		
		
		
	}
}
