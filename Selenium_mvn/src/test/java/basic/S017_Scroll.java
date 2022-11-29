package basic;

import util.Driverconnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S017_Scroll {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,50)");
//		WebElement Element = driver.findElement(By.id("uploadPicture"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
	
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
