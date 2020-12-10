package homework;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import common.BaseTest;

class H2 extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.trademe.co.nz/");
	}

	@Test
	void test() throws IOException
	{
		driver.findElement(By.id("searchString")).sendKeys("milk");
		driver.findElement(By.cssSelector(".btn-trademe")).click();
//		driver.findElement(By.className("btn-trademe")).click();
		
		String searchResult = driver.findElement(By.className("search-results-text")).getText();
		assertThat(searchResult).isEqualTo("Search results for 'milk'");
		
		TakesScreenshot ts = (TakesScreenshot) driver; //casting
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("SearchForMilk.png"));
		
		driver.navigate().back();
	}
}
