package homework;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest;

class H6 extends BaseTest
{
	private String firstTabTitle = "Policies, terms & conditions – Help - Trade Me";
	
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.trademe.co.nz/");
	}

	@Test
	void test() throws InterruptedException
	{
		driver.findElement(By.linkText("Policies")).click();
		
		String firstTab = driver.getWindowHandle();
		String secondTab = "";
		
		driver.findElement(By.linkText("Cars")).click();
		
		Set<String> allWindows = driver.getWindowHandles(); 
		
		for (String handle: allWindows)
			if (!handle.equals(firstTab))
				secondTab = handle;
		driver.switchTo().window(secondTab);
		
		WebElement searchCars = driver.findElement(By.className("tm-motors-search-form__tab-text"));
		assertThat(searchCars.getText()).isEqualTo("Cars");
		
		driver.close();
//		Thread.sleep(3000);
		
		driver.switchTo().window(firstTab);
		assertThat(driver.getTitle()).isEqualTo(firstTabTitle);
	}
}
