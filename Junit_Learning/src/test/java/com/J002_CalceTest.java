package com;

import static org.junit.Assert.assertEquals;

import org.Calc;
import org.junit.Test;

public class J002_CalceTest {
	
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actual =  c.add(10, 20);
		int expected = 30;
		
		assertEquals(expected, actual);
	}
}
