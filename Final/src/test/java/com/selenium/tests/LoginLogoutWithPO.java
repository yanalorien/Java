package com.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.selenium.common.BaseTest;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;

class LoginLogoutWithPO extends BaseTest
{
	@Test
	void validLogin()
	{
		HomePage homePage = LoginPage.open(driver)
				 					 .validLogin("tomsmith", "SuperSecretPassword!");
		assertTrue(homePage.getLoginConfirmation().contains("You logged into"));
		
		LoginPage loginPage = homePage.logout();
		assertTrue(loginPage.getConfirmation().contains("You logged out"));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "ddt.csv", numLinesToSkip = 1)
	void invalidLogin(String username, String password, String expected)
	{
		LoginPage loginPage = LoginPage.open(driver);
		loginPage.submitLogin(username, password);
		assertTrue(loginPage.getConfirmation().contains(expected));
	}
}
