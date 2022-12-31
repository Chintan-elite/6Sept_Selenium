package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverconnection {
	
	public static WebDriver connect()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
		
	}
}
