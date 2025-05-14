package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgAssignment1 {
	WebDriver driver;
//Editing from local workspace
	@Test
	public void LaunchBrowser()
	{
		driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		driver.quit();
	}

	


}
