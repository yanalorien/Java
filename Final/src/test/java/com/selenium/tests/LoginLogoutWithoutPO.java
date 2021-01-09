package com.selenium.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.common.Base;

class LoginLogoutWithoutPO extends Base
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@Test
	void test()
	{
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		WebElement buttonLogin = driver.findElement(By.className("radius"));
		clickElement(buttonLogin);
		
		WebElement confirmLogin = driver.findElement(By.id("flash"));
		assertThat(confirmLogin.getText()).contains("You logged into");
		
		WebElement buttonLogout = driver.findElement(By.cssSelector(".button.secondary.radius"));
		clickElement(buttonLogout);
		
		WebElement confirmLogout = driver.findElement(By.id("flash"));
		assertThat(confirmLogout.getText()).contains("You logged out");
	}
}
