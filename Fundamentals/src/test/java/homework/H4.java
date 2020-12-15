package homework;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest;

class H4 extends BaseTest
{
	private String givenColumnName = "Phone";
	@BeforeEach
	void open() throws Exception
	{
		driver.get("http://demo.automationtesting.in/WebTable.html");
	}

	@Test
	void test()
	{
		int givenColumn = 0;
		int currentColumn = 1;
		
		System.out.println("Column headers:");
		List<WebElement> headers = driver.findElements(By.className("ui-grid-header-cell-label"));

		for (WebElement header : headers)
		{
			String columnName = header.getText();
			System.out.println(columnName);
			if (columnName.contains(givenColumnName))
				givenColumn = currentColumn;
			else
				currentColumn++;
		}
		
		System.out.println("\n" + givenColumnName + " number is " + givenColumn);
		
		By columnXPath = By.xpath("//div[@role='row']/div[" + givenColumn + "]/div");
		List<WebElement> columnValues = driver.findElements(columnXPath);
		for (int i = 1; i < columnValues.size(); i++)
			System.out.println(columnValues.get(i).getText());
	}
}
