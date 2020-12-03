package tests.dropdown;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest;

class DropdownChecks extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("http://www.compendiumdev.co.uk/selenium/basic_html_form.html");
	}

	@Test
	void testingDropdown() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.name("dropdown"));
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("Drop Down Item 6");
		
		s.selectByIndex(1);
		
		String optionSelected = s.getFirstSelectedOption().getText();
		System.out.println(optionSelected);
		
		System.out.println("All options:");
		List<WebElement> list = s.getOptions();
		for(WebElement e: list)
			System.out.println(e.getText());
		Thread.sleep(3000);
	}
}
