package tests.pagination;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		
		int resultsDisplayed = Integer.parseInt(resultWords[1].split("-")[1]);
		System.out.println("Maximum results displayed on one page: " + resultsDisplayed);
		
// total number of pages
		int numberOfPages = (int)Math.ceil((double)totalResults/resultsDisplayed);
		System.out.println("Total number of pages: " + numberOfPages);
		
		int actualTotalResults = 0;
		for (int i = 1; i <= numberOfPages; i++)
		{
			List<WebElement> visibleResults = driver.findElements(By.className("tallCellView"));
			int resultsOnPage = visibleResults.size();
			actualTotalResults += resultsOnPage;
			
			System.out.println("Page: " + i + " visible results: " + resultsOnPage);
			
			if (i == numberOfPages)
				break;
			driver.findElement(By.linkText("Next→")).click();
		}
		assertThat(actualTotalResults).isEqualTo(totalResults);
	}
}
