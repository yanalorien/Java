package com.selenium.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.common.BasePage;

public class LoginPage extends BasePage
{
	private String title = "The Internet";
	private static String URL = "https://the-internet.herokuapp.com/login";
	
// elements
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(className = "radius")
	private WebElement buttonLogin;
	
	@FindBy(id = "flash")
	private WebElement confirmLogout;
	
// constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		assertEquals(title, driver.getTitle(), "This is not the login page");
	}
	
// services
	public static LoginPage open(WebDriver driver)
	{
		driver.get(URL);
		return PageFactory.initElements(driver, LoginPage.class);
	}
}



