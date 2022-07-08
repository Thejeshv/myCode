package com.myCode.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL="http://admin-demo.nopcommerce.com/";
	public String username="admin@yourstore.com";
	public String password="admin";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers/geckodriver.exe" );
		driver=new FirefoxDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
}
