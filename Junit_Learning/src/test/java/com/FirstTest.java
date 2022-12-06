package com;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTest {
		
	@Test
	public void test1()
	{
		System.out.println("running test1...");
	}
	
	@Ignore
	@Test
	public void test2()
	{
		System.out.println("running test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("running test 3");
	}
}
