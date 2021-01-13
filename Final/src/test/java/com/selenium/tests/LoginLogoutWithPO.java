package com.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		assertTrue(loginPage.getLogoutConfirmation().contains("You logged out"));
	}
	
//	@Test
//	void invalidTest()
//	{
//		
//	}
}
