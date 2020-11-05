package us.pasv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Generic Template")
class TemplateTest
{
	@BeforeAll
	static void oneTimeSetUp()
	{
		System.out.println("@BeforeAll - oneTimeSetUp");
	}
	
	@BeforeEach
	void setUp()
	{
		System.out.println("@BeforeEach - setUp");
	}
	
	@DisplayName("My first test")
	@Test
	void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	void test2()
	{
		System.out.println("test2");
	}
	
	@Disabled("not ready yet")
	@Test
	void test3()
	{
		System.out.println("test3");
	}
	
	@AfterEach
	void tearDown()
	{
		System.out.println("@AfterEach - tearDown");
	}
	
	@AfterAll
	static void oneTimeTearDown()
	{
		System.out.println("@AfterAll - oneTimeTearDown");
	}
}
