package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S006_WebTable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		
		WebElement text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[3]"));
		System.out.println(text.getText());
		System.out.println(text.getAttribute("style"));
		System.out.println(text.getAttribute("xpath"));
		
		
		
		
		
		
		
	}
}
