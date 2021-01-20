package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestSeleniumJenkins2
{
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception
	{
		String osName = System.getProperty("os.name");
		System.out.println("OS: " + osName);
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		driver.quit();
	}

	@Test
	void test()
	{
		System.out.println("Bye, Selenium!");
		driver.get("https://www.selenium.dev/");
		assertTrue(driver.getTitle().contains("SeleniumHQ"));
	}
}
