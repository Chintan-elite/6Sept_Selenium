package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Driverconnection;

public class LoginTest {
	
	@Parameters({"uname","pass"})
	@Test
	public void login(String username, String password)
	{
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
		WebElement u =  driver.findElement(By.id("email"));
		u.clear();
		u.sendKeys(username);
		WebElement p =  driver.findElement(By.id("pass"));
		p.clear();
		p.sendKeys(password);
	}
}
