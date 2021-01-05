package tests.timing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

class ExplicitImplicit
{
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	}

	@Test
	void withImplicit()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("start")).click();
		WebElement helloWorld = driver.findElement(By.id("finish"));
		assertThat(helloWorld.getText()).isEqualTo("Hello World!");
	}
	
	@Test
	void withExplicit()
	{
		driver.findElement(By.tagName("button")).click();
		WebElement helloWorld = new WebDriverWait(driver, 15)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		assertThat(helloWorld.getText()).isEqualTo("Hello World!");
	}
	
	@Test
	void elementNotOnPageWithImplicit()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("VB"));
	}
	
	@Test
	void elementNotOnPageWithoutImplicit()
	{
		driver.findElement(By.id("VB"));
	}
	
	@Test
	void elementNotOnPageExplicit()
	{
		new WebDriverWait(driver, 15)
			.until(ExpectedConditions.invisibilityOfElementLocated(By.id("VB")));	
		System.out.println("explicit invisibility");
	}
	
	@AfterEach
	void tearDown()
	{
		driver.quit();
	}
}
