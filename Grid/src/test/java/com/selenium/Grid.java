package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class Grid
{
	private WebDriver driver;
	
	public void openGoogle(Capabilities capabilities) throws MalformedURLException
	{
		driver = new RemoteWebDriver(new URL("http://172.29.243.226:4444/wd/hub"), capabilities);
		driver.get("https://www.google.com");
	}

	@Test
	void test() throws MalformedURLException
	{
		var capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		openGoogle(capabilities);
	}
	
	@Test
	void testInFirefox() throws MalformedURLException
	{
		var capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		openGoogle(capabilities);
	}
	
	@AfterEach
	void tearDown()
	{
		driver.quit();
	}
}
