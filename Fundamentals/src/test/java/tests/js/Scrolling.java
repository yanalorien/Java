package tests.js;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import common.BaseTest;

class Scrolling extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.kmart.com/");
	}

	@Test
	void test() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver; //casting
		jse.executeScript("window.scroll(0, 5000)");
		Thread.sleep(5000);
	}
}
