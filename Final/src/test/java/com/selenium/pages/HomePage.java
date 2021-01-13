package com.selenium.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.common.BasePage;

public class HomePage extends BasePage
{
	private String title = "The Internet";
	
//elements
	@FindBy(id = "flash")
	private WebElement confirmLogin;
	
	@FindBy(css = ".button.secondary.radius")
	private WebElement buttonLogout;
	
// constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		assertEquals(title, driver.getTitle(), "This is not the home page");
	}
	
// services
	public LoginPage logout()
	{
		clickElement(buttonLogout);
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public String getLoginConfirmation()
	{
		return confirmLogin.getText();
	}
}
