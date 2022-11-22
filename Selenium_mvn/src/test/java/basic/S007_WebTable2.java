package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S007_WebTable2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> rows  =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		for(int i=2;i<=rows.size();i++)
		{
		   List<WebElement> cols =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
		   for(int j=1;j<=cols.size();j++)
		   {
			  String data =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
			  System.out.print(data+" ");
		   }
		   System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
