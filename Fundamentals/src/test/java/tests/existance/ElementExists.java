package tests.existance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import common.BaseTest;

class ElementExists extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.kmart.com/");
	}

	@Test
	void test()
	{
		String titleToSwitch = "Home";
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.xpath("//a[@href='https://searskmart.force.com/kmartask\']")).click();
	
		Set<String> allWindows = driver.getWindowHandles();
		for(String handle: allWindows)
		{
			driver.switchTo().window(handle);
			if (titleToSwitch.equals(driver.getTitle()))
				break;
		}
		
		int numberOfElements = driver.findElements(By.tagName("input")).size();
		assertThat(numberOfElements).isEqualTo(1);
		
// id = MyElement
		int numberMyElements = driver.findElements(By.id("MyElement")).size();
		assertThat(numberMyElements).isEqualTo(0);
	}
}
