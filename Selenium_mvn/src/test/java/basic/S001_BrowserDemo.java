package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S001_BrowserDemo {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://topshrms.in/";
		driver.get(url);
		
		String myTitle = "Tops HRMS";
		String actualTitla =driver.getTitle();
		System.out.println(actualTitla);
		if(myTitle.equals(actualTitla))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
	}
}
