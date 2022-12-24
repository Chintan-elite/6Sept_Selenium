package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void test1()
	{
		//assertFalse(true);
		System.out.println("running test1");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("running test2");
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("running test3");
	}
}
