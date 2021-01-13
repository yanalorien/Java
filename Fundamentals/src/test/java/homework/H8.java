package homework;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BaseTest;

class H8 extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.kmart.com/");
		List<WebElement> cookies = driver.findElements(By.id("onetrust-accept-btn-handler"));
		if (cookies.size() == 1)
			cookies.get(0).click();
	}	

	@Test
	void test() throws InterruptedException
	{
		String titleToSwitch = "Home";
		driver.findElement(By.linkText("Help")).click();
		
// press "Have a Question?" 		
		By cssHelpCenter = By.cssSelector(".bottom-half-margin img");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(cssHelpCenter));
		driver.findElement(cssHelpCenter).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows)
		{
			driver.switchTo().window(window);
			if (titleToSwitch.equals(driver.getTitle()))
				break;
		}
		
// "Search the help center" text box		
		By xpathSearch = By.xpath("//input");
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpathSearch));
		driver.findElement(xpathSearch).sendKeys("order return");
		
// magnifying glass button		
		driver.findElement(By.className("slds-button_icon")).click();

		By cssResults = By.cssSelector("div:nth-child(5) > p");
		wait.until(ExpectedConditions.visibilityOfElementLocated(cssResults));
				
		assertTrue(driver.findElement(cssResults).getText().contains("Results"));
	}
}

