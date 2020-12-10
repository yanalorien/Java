package homework;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import common.BaseTest;

class H3 extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://duckduckgo.com/");
	}

	@Test
	void test()
	{
//		driver.findElement(By.id("search_form_input_homepage")).sendKeys("maven");
//		driver.findElement(By.id("search_button_homepage")).click();
		
//		String searchBoxText = driver.findElement(By.id("search_form_input")).getAttribute("value");
//		assertThat(searchBoxText).isEqualTo("maven");
		
//		String searchResult = driver.findElement(By.className("module__title__link")).getText();
//		assertThat(searchResult).isEqualTo("Apache Maven");
		
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("maven", Keys.ENTER);
		// Keys.ENTER - нажатие на клавишу enter, вместо строки ниже
		
		WebElement searchBox = driver.findElement(By.id("search_form_input"));
		String maven = searchBox.getAttribute("value");
		assertThat(maven).isEqualTo("maven");
		
		List<WebElement> mavens = driver.findElements(By.partialLinkText("Apache Maven"));
		assertTrue(mavens.size() > 0);
	}
}
