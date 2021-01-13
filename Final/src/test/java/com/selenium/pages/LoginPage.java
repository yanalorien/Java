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
	
	@FindBy(id = "VB")   // lazy binding - until we don't interact with element, we don't search fo them
	private WebElement vladimir;
	
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
	
	private void submitLogin(String user, String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		clickElement(buttonLogin);
	}
	
	public HomePage validLogin(String user, String pass)
	{
		submitLogin(user, pass);
		return new HomePage(driver);
//		return PageFactory.initElements(driver, HomePage.class);
	}
	
	public String getLogoutConfirmation()
	{
		return confirmLogout.getText();
	}
	
	public LoginPage invalidLogin(String user, String pass)
	{
		submitLogin(user, pass);
		return this;
	}
}



