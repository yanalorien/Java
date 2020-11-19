package q7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAddition
{
	private Calculator calc;
	
	@BeforeEach
	void setUp()
	{
		calc = new Calculator();
		calc.switchOn();
	}
	
	@Test
	void test()
	{
		calc.addition(1);
		calc.addition(3);
		assertEquals(4, calc.getResult());
	}
	
	@Test
	void test2()
	{
		calc.addition(100);
		calc.addition(100);
		assertEquals(200, calc.getResult());
	}
}
