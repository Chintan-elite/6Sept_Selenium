package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class J003_AnnotationDemo {
	
	@Test
	public void alpha()
	{
		System.out.println("running alpha test");
	}
	
	@Test
	public void beta()
	{
		System.out.println("running beta test");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Running before every test");
	}
	
	@Test
	public void gama()
	{
		System.out.println("running gama test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("Running after every test");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Runnig before class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("running after class");
	}
}
