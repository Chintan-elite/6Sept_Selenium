package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Driverconnection;

public class S010_AlertDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/alerts");
		
		//btn-1
//		WebElement btn  =driver.findElement(By.id("alertButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//btn-2
		WebElement btn  =driver.findElement(By.id("timerAlertButton"));
		btn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		//btn-3
//		WebElement btn  =driver.findElement(By.id("confirmButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		//alert.accept();
//		alert.dismiss();
		
//		WebElement btn  =driver.findElement(By.id("promtButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("welcome");
//		alert.accept();
//		//alert.dismiss();
		
		
		
	}
}
