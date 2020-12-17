package homework;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest;

class H5 extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.trademe.co.nz/");
	}

	@Test
	void test()
	{
		driver.findElement(By.linkText("Services")).click();
		Select regions = new Select(driver.findElement(By.id("134")));
		regions.selectByVisibleText("Auckland");
		
		Select category = new Select(driver.findElement(By.id("193")));
		category.selectByVisibleText("Events & entertainment");
		
		Select subCategory = new Select(driver.findElement(By.id("209")));
		subCategory.selectByVisibleText("Photography & video");
		
		driver.findElement(By.id("Sidebar-153")).sendKeys("wedding");
		
		driver.findElement(By.className("button27")).click();
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Wedding"));
		assertThat(links.size()).isGreaterThan(0);
		for (WebElement link: links)
		{
			System.out.println(link.findElement(By.className("title")).getText());
		}
	}
}
