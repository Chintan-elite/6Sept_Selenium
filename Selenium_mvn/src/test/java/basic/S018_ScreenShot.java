package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class S018_ScreenShot {

	public static void getScreenShot(WebDriver driver, String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("Screen Shot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {

		WebDriver driver = Driverconnection.connect();
		driver.get("https://topsint.com/topserp/index.php");
		getScreenShot(driver,"D:\\img\\abc.png");
		
		driver.findElement(By.name("btn_login")).click();
		
		getScreenShot(driver, "D:\\img\\error.png");
		
	}
}
