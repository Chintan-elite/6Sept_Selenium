package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class J004_AnnotationDemo {
		
		static WebDriver driver;
		@BeforeClass
		public static void openBrowser()
		{
			driver = Driverconnection.connect();
			driver.get("https://www.facebook.com/");
	
		}
	
		@Test
		public void titleCheck()
		{
		assertEquals("Facebook – log in or sign up", driver.getTitle());
		}
		
		@Test
		public void loginCheck()
		{
			driver.findElement(By.id("email")).sendKeys("tops");
			driver.findElement(By.id("pass")).sendKeys("tech123");
			driver.findElement(By.name("login")).click();
		}
		
		public static void close()
		{
			driver.quit();
		}
}

