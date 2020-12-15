package tests.pagination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import common.BaseTest;

class Pagination extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.amazon.com/events/holidaydeals");
	}

	@Test
	void test()
	{
		driver.findElement(By.xpath("//div[2]/span[11]/div[1]/label[1]/input[1]")).click();
		String results = 
				driver.findElement(By.cssSelector("div#FilterItemView_all_summary > div > span:nth-of-type(1)")).getText();
		System.out.println(results);
		
		String[] resultWords = results.split(" ");
		int totalResults = Integer.parseInt(resultWords[3]); // Double Float
		System.out.println("Total results found: " + totalResults);	
	}
}
