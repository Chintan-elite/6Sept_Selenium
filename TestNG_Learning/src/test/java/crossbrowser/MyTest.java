package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest {
	
	@Parameters("browser")
	@Test
	public void test(String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
			driver = new ChromeDriver();
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\BrowserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://topsint.com/topserp/index.php");
		
	}
}
