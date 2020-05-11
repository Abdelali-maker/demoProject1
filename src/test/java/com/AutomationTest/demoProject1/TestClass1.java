package com.AutomationTest.demoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\utilities\\chromedriver_win32\\chromedriver81.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void testCase1() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("title test 1 is :"+driver.getTitle());
	}

	
	 @Test 
	 public void testCase2() { 
		 driver.navigate().to("https://www.google.com");
		 System.out.println("title test 2 is :"+driver.getTitle());
	 
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
