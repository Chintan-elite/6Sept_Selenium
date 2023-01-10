package project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Day1 {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","D:\\BrowserDriver\\geckodriver.exe");
		//WebDriver  driver = new FirefoxDriver();
		
		File binaryPath = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary fb = new FirefoxBinary(binaryPath);
		
		FirefoxProfile profile = new FirefoxProfile();
		WebDriver  driver = new FirefoxDriver();
		
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("uid"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		
		username.sendKeys("mngr469697");
		password.sendKeys("amYnAzU");
		login.click();
		
		
//		String text = driver.findElement(By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[3]/td")).getText();
//		if(text.equals("Manger Id : mngr469697"))
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}
		
		
		try 
		{
			WebElement text = driver.findElement(By.xpath("//*[text()='Manger Id : mngr469697']"));
			if(text.isDisplayed())
			{
				System.out.println("passed!!!");
			}
			
		} catch (Exception e) {
			System.out.println("Failed");
		}
	}
}
