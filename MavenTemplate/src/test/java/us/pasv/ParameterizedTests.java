package us.pasv;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTests
{
	@ParameterizedTest(name = "print palindromes")
	@ValueSource(strings = {"racecar", "radar", "Madam Im Adam"})
	void valueSourceAsStrings(String pal)
	{
		System.out.println(pal);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {25, 68, 101})
	void valueSourceAsInts(int num)
	{
		assertTrue(num > 0 && num < 102);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"test:1", "test:2", "test:3"}, delimiter = ':')
	void csvWithDelimiter(String key, int value)
	{
		System.out.println(key + ":" + value);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "ddt.csv", numLinesToSkip = 1)
	void ddtTest(int test, String name, String exp)
	{
		System.out.println(test + " " + name + " " + exp);
	}
	
	
	
}
