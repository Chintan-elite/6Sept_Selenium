package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class S016_KeyboardEvent {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		
		builder.click(search)
				.keyDown(Keys.SHIFT)
				.sendKeys("tops technologies")
				.keyUp(Keys.SHIFT)
				.pause(Duration.ofSeconds(5))
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		
		
		
	}
}
