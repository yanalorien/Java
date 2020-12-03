package tests.locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest;

class Links extends BaseTest
{
	@BeforeEach
	void open()
	{
		driver.get("http://book.theautomatedtester.co.uk/");
	}
	
	@Test
	void testingLinks()
	{
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		int numberOfLinks = list.size();
		System.out.println("Number of links on the page: " + numberOfLinks);
		
		for (int i = 0; i < numberOfLinks; i++)
		{
			WebElement e = list.get(i);
			System.out.println((i+1) + ". " + e.getText() + ":" + e.getAttribute("href"));
		}
	}
	
	@Test
	void getPageHTML()
	{
		String body = driver.getPageSource();
		System.out.println("Page HTML code:\n" + body);
		assertTrue(body.contains("Selenium"));
	}
}
