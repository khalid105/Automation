package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {
WebDriver driver ;
	
	Properties prop;
	String CountryId;
	String QAUrl;
	
	@BeforeClass
	public void Initalization() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\properties\\config.properties"); //Finding the location of config file
		 prop = new Properties();
		 
		 prop.load(fis); //loading the data 
		 
		  QAUrl = prop.getProperty("QA_Url");
		  CountryId = prop.getProperty("CountryLocator");
		
		
		driver = new ChromeDriver();

		driver.get(QAUrl);

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void CleanUp()
	{
		driver.quit();
	}

}
