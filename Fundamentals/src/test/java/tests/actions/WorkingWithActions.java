package tests.actions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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
	
	}

	@Test
	void moveMouseWithAlert() throws InterruptedException
	{
		driver.get("http://book.theautomatedtester.co.uk/chapter4");
		isAlertPresent();
		WebElement mouseOver = driver.findElement(By.id("hoverOver"));
		builder.moveToElement(mouseOver).perform();
		Thread.sleep(2000);
		
		isAlertPresent();
		Thread.sleep(2000); 				
	}

	@Test
	void moveMouseWithOffset()
	{
		driver.get("https://www.webminal.org/");
		WebElement registerButton = driver.findElement(By.linkText("Register")); 
		builder.moveByOffset(registerButton.getLocation().getX() + 8,
							 registerButton.getLocation().getY() + 8)
		       .click().perform();
		assertThat(driver.findElement(By.xpath("//h2[1]")).getText()).isEqualTo("Join");
	}
	
	@Test
	void dragAndDrop()
	{
		driver.get("https://demoqa.com/droppable");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		builder.dragAndDrop(source, destination).perform();
	}
	
	private void isAlertPresent()
	{
		try
		{
			if (driver.switchTo().alert() != null)
			{
				System.out.println("Alert was detected and closed");
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}
		}
		catch (NoAlertPresentException e)
		{
			System.out.println("There was no alert on the page");
		}
	}
}


