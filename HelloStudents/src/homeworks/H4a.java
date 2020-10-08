// calculate factorial of : n! = n * (n � 1)!
package homeworks;

public class H4a
{
	public int fact1(int n)
	{
		int fact = 1;
		
		for (int i = 1; i <= n; i++)
			fact *= i; //fact = fact * i;
		return fact;
	}
	
	public int fact2(int n)
	{
		if (n == 1)
			return 1;
		else
			return (n * fact2(n - 1));
	}
	
	public static void main(String[] args)
	{
		H4a h = new H4a();
		System.out.println("Factorial of 4: " + h.fact1(4));
		
		System.out.println("Factorial of 4: " + h.fact2(4));
	}
}
