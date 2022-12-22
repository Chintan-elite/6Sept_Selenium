package eshop;

import org.testng.annotations.Test;

public class Payment {
	
	@Test(groups = {"smoke","sanity"})
	public void creditCard()
	{
		System.out.println("Runing creditcard payment");
	}
	
	@Test
	public void debitCard()
	{
		System.out.println("running debitcard payment");
	}
	
	@Test(groups = "sanity")
	public void cod()
	{
		System.out.println("running cod payment");
	}
}
