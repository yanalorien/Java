package tests.actions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.BaseTest;

class WorkingWithActions extends BaseTest
{
	private Actions builder;
	
	@BeforeEach
	void open() throws Exception
	{
		builder = new Actions(driver);
		driver.get("http://book.theautomatedtester.co.uk/chapter4");
	}

	@Test
	void test() throws InterruptedException
	{
		WebElement mouseOver = driver.findElement(By.id("hoverOver"));
		builder.moveToElement(mouseOver).perform();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
// allert.dismiss();
		Thread.sleep(2000);
	}
}
