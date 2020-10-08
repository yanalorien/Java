package homeworks;

public class H4b
{
	public int sum(int n)
	{
		if (n == 1)
			return 1;
		else
			return n + sum(n - 1);
	}
	
	public static void main(String[] args)
	{
		H4b h = new H4b();
		System.out.println("Sum of 6: " + h.sum(6));
	}
}
