package com.selenium.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.selenium.common.BasePage;

public class HomePage extends BasePage
{
	private String title = "The Internet";
	
//elements
	private By confirmLogin = By.id("flash");
	private By buttonLogout = By.cssSelector(".button.secondary.radius");
	
// constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		assertEquals(title, driver.getTitle(), "This is not the home page");
	}
	
// services
	public LoginPage logout()
	{
		clickElement(driver.findElement(buttonLogout));
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public String getLoginConfirmation()
	{
		return driver.findElement(confirmLogin).getText();
	}
	
}
