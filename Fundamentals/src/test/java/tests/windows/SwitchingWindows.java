package tests.windows;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import common.BaseTest;

class SwitchingWindows extends BaseTest
{
	private String firstTabTitle = "The Internet";
	private String titleToSwitch = "New Window";
	
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://the-internet.herokuapp.com/windows");
	}

	@Test
	void test() throws InterruptedException
	{
		String firstTab = driver.getWindowHandle(); //дает handle текущего окна
		String secondTab = "";
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allWindows = driver.getWindowHandles(); //дает сет всех открытых окошек
// 1 
		for(String handle: allWindows)
		{
			driver.switchTo().window(handle);
			if (titleToSwitch.equals(driver.getTitle()))
				break;
		}
		
// 2
		for (String handle: allWindows)
			if (!handle.equals(firstTab))
				secondTab = handle;
		driver.switchTo().window(secondTab);
		driver.switchTo().window(firstTab);
		assertThat(driver.getTitle()).isEqualTo(firstTabTitle);
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(secondTab);
		assertThat(driver.getTitle()).isEqualTo(titleToSwitch);
	}
}
