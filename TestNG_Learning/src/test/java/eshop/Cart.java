package eshop;

import org.testng.annotations.Test;

public class Cart {
	
	@Test(groups = "smoke")
	public void editItem()
	{
		System.out.println("edit item runnig...");
	}
	
	@Test(groups = "sanity")
	public void removeItem()
	{
		System.out.println("running remove item...");
	}
}
