package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class WorkingWithRemote
{
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception
	{
		var capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
	}

	@Test
	void test()
	{
		driver.get("https://www.selenium.dev/downloads/");
		assertEquals("Downloads", driver.getTitle());
	}
	
	@AfterEach
	void teardown()
	{
		driver.quit();
	}
}
