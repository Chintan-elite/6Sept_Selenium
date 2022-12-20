package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.Calc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class J007_Parameterised {
	
	int a;
	int b;
	int result;
	
	public J007_Parameterised(int a, int b, int result) {
		super();
		this.a = a;
		this.b = b;
		this.result = result;
	}

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actual =  c.add(a, b);
		int expected = result;
		assertEquals(expected, actual);
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][3];
		
		obj[0][0] = 10;
		obj[0][1] = 20;
		obj[0][2] = 30;
		
		obj[1][0] = 10;
		obj[1][1] = 100;
		obj[1][2] = 110;	
		
		obj[2][0] = 20;
		obj[2][1] = 50;
		obj[2][2] = 70;
		
		obj[3][0] = 50;
		obj[3][1] = 30;
		obj[3][2] = 80;
		
		return Arrays.asList(obj);
	}
}
