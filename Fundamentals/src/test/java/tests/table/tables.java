package tests.table;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest;

class tables extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("http://the-internet.herokuapp.com/tables");
	}

	@Test
	void test()
	{
		List<WebElement> rows = driver.findElements(By.xpath("//table[2]/tbody/tr"));
		int numberOfRows = rows.size();
		System.out.println("Numbers of rows in the Table 2: " + numberOfRows);
		
		System.out.println("First method");
		for(WebElement row: rows)
		{
			String[] rowText = row.getText().split(" ");
			System.out.println(rowText[3] + " " + rowText[4]);
		}
	}
}
