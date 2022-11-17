package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S005_PracticeForm {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElement(By.name("firstname")).sendKeys("abc");
			driver.findElement(By.name("lastname")).sendKeys("abc");
			
			List<WebElement> gender = driver.findElements(By.name("sex"));
			gender.get(1).click();
			
			List<WebElement> exp = driver.findElements(By.name("exp"));
			exp.get(2).click();
			
			driver.findElement(By.id("datepicker")).sendKeys("10-02-2022");
			
			driver.findElement(By.id("profession-1")).click();
			
			
			driver.findElement(By.id("tool-1")).click();
			
			
			WebElement con = driver.findElement(By.id("continents"));
			Select cons = new Select(con);
			cons.selectByVisibleText("Africa");
			
			WebElement command = driver.findElement(By.id("selenium_commands"));
			Select commands = new Select(command);
			commands.selectByVisibleText("Switch Commands");
			commands.selectByVisibleText("Wait Commands");
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.close();
			
			
			
		}
}
