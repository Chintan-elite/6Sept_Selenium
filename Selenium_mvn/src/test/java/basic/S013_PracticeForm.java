package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class S013_PracticeForm {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/automation-practice-form");
		Actions builder = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		driver.findElement(By.id("firstName")).sendKeys("abcd");
		driver.findElement(By.id("lastName")).sendKeys("xyz");
		driver.findElement(By.id("userEmail")).sendKeys("usermail@gmail.com");
		driver.findElement(By.xpath("//*[@id='gender-radio-1']/following-sibling::label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9865635254");
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		String myDate = "22";
		String mymonth = "March";
		String myYear = "2025";
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(mymonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
		for(WebElement date : dates)
		{
			String dt = date.getText();
			if(dt.equals(myDate))
			{
				String label = date.getAttribute("aria-label");
				if(label.contains(mymonth))
				{
					date.click();
					break;
				}
				
			}
		}
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		builder.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']/following-sibling::label")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\chintan\\Desktop\\classwork\\logo-tops.png");
		
		driver.findElement(By.id("currentAddress")).sendKeys("surat");
		
		Thread.sleep(5000);
		driver.quit();
		
		
	
	
	}
}
