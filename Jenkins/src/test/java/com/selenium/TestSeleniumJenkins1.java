package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestSeleniumJenkins1
{
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception
	{
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}

	@Test
	void openSchoolWebSite()
	{
		System.out.println("Hi, School!");
		driver.get("https://pasv.us/en");
		assertTrue(driver.getTitle().contains("QA automation"));
	}
}
