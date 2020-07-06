package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public void initialize()
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
