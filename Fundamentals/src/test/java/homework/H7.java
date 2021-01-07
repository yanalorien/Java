package homework;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.BaseTest;

class H7 extends BaseTest
{
	private Actions builder;
	
	@BeforeEach
	void open() throws Exception
	{
		builder = new Actions(driver);
	}

	@Test
	void test() throws InterruptedException
	{
		driver.get("https://www.demoqa.com/dragabble");
		WebElement source = driver.findElement(By.id("dragBox"));

		int xMove = 67;
		int yMove = 67;
		
		builder.dragAndDropBy(source, xMove, yMove).perform();
		Thread.sleep(5000);
		assertThat(source.getAttribute("style")).isEqualTo("position: relative; left: 67px; top: 67px;");
		
	}
}
