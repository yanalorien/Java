package us.pasv;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionsJUnit5
{
	@DisplayName("Standard assertions")
	@Test
	void test()
	{
		assertEquals(2, 1 + 1, "sum 1 + 1 must be 2");
		assertTrue(2 == (1 + 1));
		assertTrue(3 > 1);
		assertFalse(1 > 11, "if 1 greater than 11");
	}
	
	@Test
	void performanceTest()
	{
		assertTimeout(Duration.ofMillis(10),
				() -> {Thread.sleep(5);});
	}
}
