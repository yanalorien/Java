package homeworks;

public class H2
{
	public boolean isEven(int number)
	{
		return (number % 2 == 0);
	}
	public static void main(String[] args)
	{
		H2 h = new H2();
		System.out.println(h.isEven(1));
	}
}
