package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class S013_PracticeForm {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
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
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
	
	
	}
}
