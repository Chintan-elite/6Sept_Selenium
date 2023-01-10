package project;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","D:\\BrowserDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/V4/");
	}
	
	@Test(dataProvider = "dp")
	public void test(String uname, String pass)
	{
		System.out.println(uname+" "+pass);
		WebElement username = driver.findElement(By.name("uid"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		login.click();
		
		try {
			
			Alert al = driver.switchTo().alert();
			String expected = "User or Password is not valid";
			assertEquals(al.getText(), expected);
		} 
		catch (NoAlertPresentException e)
		{
			
			String actual = driver.findElement(By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[3]/td")).getText();
			String expected = "Manger Id : mngr469697";
			assertEquals(actual, expected);
			driver.navigate().back();
		}
		
		
	}
	
	@DataProvider(name="dp")
	public Object getData()
	{
		ExcellReader rs = new ExcellReader("C:\\Users\\chintan\\Desktop\\classwork\\mytest.xlsx", "data");
		int row = rs.rowCount();
		int col = rs.colCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rs.getData(i, j);
				obj[i-1][j]=data;
			}
		}
		
		return obj;
	
	}



}
