package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class S020_Tagname {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		String str[] = new String[tags.size()];
		int k=0;
		for(WebElement tag : tags)
		{ 
			System.out.println(tag.getText());
			if(!tag.getText().equals(""))
			{
				str[k] = tag.getText();
				k++;
			}
			
		}
		
		for(String s : str)
		{
			System.out.println(s);
			driver.findElement(By.linkText(s)).click();
			
			Thread.sleep(5000);
			driver.navigate().back();
		}
		
	}
}
