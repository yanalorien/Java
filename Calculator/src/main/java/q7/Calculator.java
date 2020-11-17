package q7;

public class Calculator
{
	private int result;
	
	public void switchOn()
	{
		result = 0;
	}
	
	public void addition(int a)
	{
		result += a;
	}

	public int getResult()
	{
		return result;
	}
	
}
