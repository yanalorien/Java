package tests.windows;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	void test()
	{
		
	}
}
