package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class C013_Calender1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		WebElement element =  driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("datepicker")).click();
		String myDate = "22";
		String mymonth = "March";
		String myYear = "2025";
			
		 String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		 int y1 = Integer.parseInt(myYear);
		 int y2 = Integer.parseInt(currentYear); //2022
		 
		 while(!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText()))
		 {
			 if(y1>y2)
			 {
			 driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			
			 
			 }
			 else
			 {
				 driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			 }
		 }
		 while(!mymonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText()))
		 {
			 if(y1>y2)
			 {
				 driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			 }
			 else
			 {
				 driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
					
			 }
					 
		 }
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date : dates)
		{
			String dt = date.getText();
			if(dt.equals(myDate))
			{
				date.click();
			}
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
