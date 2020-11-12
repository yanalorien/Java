package us.pasv;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class UsingAssertJ
{
	private Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);
	private List<String> list = Arrays.asList("1", "2", "3");
	private String name = "Vladimir";
	
	@Test
	void mapTest()
	{
		assertThat(map)
			.isNotEmpty()
			.doesNotContainKey("Ten")
			.contains(entry("Three", 3));
	}
	
	@Test
	void listTest()
	{
		assertThat(list)
			.isNotEmpty()
			.contains("1")
			.containsSequence("2", "3")
			.doesNotContain("13");
	}
	
	@Test
	void stringTest()
	{
		assertThat(name).isEqualTo("Vladimir");
		assertThat(name).as("testing name").isNotEqualTo("Vlad");
	}
	
	@Test
	void softTest()
	{
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(name)
			.startsWith("Tony")
			.contains("B");
		
		softly.assertAll();
	}
}







