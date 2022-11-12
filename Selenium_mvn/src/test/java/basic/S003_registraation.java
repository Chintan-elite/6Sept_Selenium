package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S003_registraation {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.name("reg_email__")).sendKeys("9865321475");
		driver.findElement(By.name("reg_passwd__")).sendKeys("kbc@rer");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		
		WebElement month =   driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("4");
		
		
		WebElement year =   driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(4);
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		//System.out.println(gender.size());
		gender.get(1).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
