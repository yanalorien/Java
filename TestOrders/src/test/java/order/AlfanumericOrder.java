package order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class AlfanumericOrder
{
	@Test
	void btest()
	{
		System.out.println("b");
	}
	
	@Test
	void atest()
	{
		System.out.println("a");
	}
	
	@Test
	void ytest()
	{
		System.out.println("y");
	}
	
	@Test
	void xtest()
	{
		System.out.println("x");
	}
}
