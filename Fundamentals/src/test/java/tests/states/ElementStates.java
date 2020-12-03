package tests.states;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest;

class ElementStates extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("http://book.theautomatedtester.co.uk/");
	}

	@Test
	void checkingStates()
	{
		driver.findElement(By.linkText("Chapter1")).click();
		WebElement checkbox = driver.findElement(By.name("selected(1234)"));
		assertTrue(checkbox.isDisplayed());
		
		checkbox.click();
		assertTrue(checkbox.isSelected());
	}
	
	@Test
	void readingInput()
	{
		WebElement textbox = driver.findElement(By.id("q"));
		textbox.sendKeys("PASV");
		String text = textbox.getAttribute("value");
		assertThat(text).isEqualTo("PASV");
	}
}
