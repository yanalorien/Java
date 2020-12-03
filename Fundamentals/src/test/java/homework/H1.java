package homework;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import common.BaseTest;

public class H1 extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.trademe.co.nz/");
	}
	
	@Test
	void test()
	{
		driver.findElement(By.id("CommunityDropDown")).click();
		driver.findElement(By.linkText("Announcements")).click();

		String announcements = driver.findElement(By.className("header")).getText();
		assertThat(announcements).isEqualTo("Announcements");
	}
}
