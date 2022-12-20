package com;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

@RunWith(Parameterized.class)
public class J008_Parameterised_login {
	
	String email;
	String pass;
	
	
	public J008_Parameterised_login(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	static WebDriver driver;
	@BeforeClass
	public static void openBrowser()
	{
		driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void logintest()
	{
		WebElement username =  driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
	}
	
	@Parameters
	public static List<Object[]> data()
	{
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "tops@gmail.com";
		obj[0][1] = "tops123";
		
		obj[1][0] = "abc@gmail.com";
		obj[1][1] = "tops123";
		
		obj[2][0] = "xyz@gmail.com";
		obj[2][1] = "tops123";
		
		return Arrays.asList(obj);
	}
}
