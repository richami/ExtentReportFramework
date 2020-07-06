package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class AddPayeeTest extends Base {

	@BeforeMethod
	public void setup()
	{
		initialize();
	}
	
	@Test
	public void verifyAddPayee()
	{
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		String actual=driver.getTitle();
		String expected="Zero - Account Summary";
		Assert.assertEquals(actual, expected,"Title does not match");
	}
	
	@AfterMethod
	public void tearDown()
	{
		closeBrowser();
	}
}
