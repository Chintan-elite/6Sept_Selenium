package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class S014_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.amazon.in/");
		
		
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bs = driver.findElement(By.linkText("Best Sellers"));
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(sell).build().perform();
		builder.moveToElement(bs).build().perform();
		builder.moveToElement(mobile).build().perform();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
