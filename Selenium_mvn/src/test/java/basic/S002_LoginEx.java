package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S002_LoginEx {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement email =  driver.findElement(By.id("email"));
			WebElement pass = driver.findElement(By.id("pass"));
			WebElement login = driver.findElement(By.name("login"));
			
			
			email.sendKeys("abc@gmail.com");
			pass.sendKeys("trfg@123");
			login.click();
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.close();
			
			
			
		}
}
