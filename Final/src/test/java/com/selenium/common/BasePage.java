package com.selenium.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
	protected WebDriver driver;
	
// stable operations	
	protected void clickElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	protected void clickElement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	protected void clickElementWithFluentWait(By locator)
	{
		new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(1))
			.ignoring(NoSuchElementException.class)
			.until(ExpectedConditions.elementToBeClickable(locator))
			.click();
	}
}
