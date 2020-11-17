package q7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddition
{
	@Test
	void test()
	{
		Calculator calc = new Calculator();
		calc.switchOn();
		calc.addition(1);
		calc.addition(3);
		assertEquals(4, calc.getResult());
	}
}
