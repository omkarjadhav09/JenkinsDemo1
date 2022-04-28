package com.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base extends Config{
	public WebDriver driver;
	
	@BeforeClass
	public WebDriver inializeDriver() throws IOException {
		String browserName = getBrowerName();
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar Jadhav\\Documents\\Workspace\\TestDemo\\src\\main\\resources\\drivers\\chromedriver.exe");
	 		driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Omkar Jadhav\\Documents\\Workspace\\TestDemo\\src\\main\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.manage().window().maximize();
		return driver;
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
