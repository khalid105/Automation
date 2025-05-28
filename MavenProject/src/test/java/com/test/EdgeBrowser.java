package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowser {
	WebDriver driver;

		@Test
		public void LaunchEdgeBrowser()
		{
			driver = new EdgeDriver();

			driver.get("https://testautomationpractice.blogspot.com/");

			driver.manage().window().maximize();

			System.out.println(driver.getTitle());
			
			driver.quit();
		}

}
