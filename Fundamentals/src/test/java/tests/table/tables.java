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
		
		System.out.println("\nSecond method");
		String cellXpath = "";
		for(int i = 1; i <= numberOfRows; i++)
		{
			cellXpath = "//table[2]/tbody/tr[" + i + "]/td[4]";
			System.out.println(driver.findElement(By.xpath(cellXpath)).getText());
		}
		
		System.out.println("\nThird method");
		List<WebElement> column = driver.findElements(By.xpath("//td[@class = 'dues']"));
		for (WebElement cell: column)
			System.out.println(cell.getText());
	}
}
