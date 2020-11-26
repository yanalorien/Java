package tests;

import static org.junit.jupiter.api.Assertions.*;
import common.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class Locators extends BaseTest
{
	@Test
	void test()
	{
		driver.navigate().to("https://www.kmart.com/");
		
// by className
		driver.findElement(By.className("ribbon-kmart-logo")).click();
		
// by CSS selector
		driver.findElement(By.cssSelector("#yourAccount")).click();
		driver.navigate().refresh();
		
// by id
		driver.findElement(By.id("keyword")).sendKeys("milk");
		
// by link text
		driver.findElement(By.linkText("Kmart home")).click();
	}
}
