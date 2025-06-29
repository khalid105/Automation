package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest extends SetUp {
	

	@Test(priority = 1)
	public void SelectDropDown() {

		WebElement Country = driver.findElement(By.id(CountryId));

		Select sel = new Select(Country);

		sel.selectByIndex(3);

		sel.selectByValue("australia");

		sel.selectByVisibleText("India");

	}

	@Test(priority = 2)
	public void AdvanceDropDown() {

		WebElement Country = driver.findElement(By.id(CountryId));

		Select sel = new Select(Country);

		List<WebElement> li = sel.getOptions();

		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) // 0 0<10
		{

			li.get(i).click();

			System.out.println(li.get(i).getText()); // alloptiontag.get(0).gettext()
		}

	}

	
}
