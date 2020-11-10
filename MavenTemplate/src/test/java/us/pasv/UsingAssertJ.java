package us.pasv;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class UsingAssertJ
{
	private List<String> list = Arrays.asList("1", "2", "3");
	
	@Test
	void listTest()
	{
		assertThat(list)
			.isNotEmpty()
			.contains("1")
			.containsSequence("2", "3")
			.doesNotContain("13");
	}
}
