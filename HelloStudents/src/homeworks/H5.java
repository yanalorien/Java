package homeworks;

public class H5
{
	public void fibonacciLoop(int n)
	{
		if (n >= 2)
		{
			System.out.print("0 1 ");
			int f0 = 0;
			int f1 = 1;
			int fn = 0;
			
			for (int i = 2; i < n; i++)
			{
				fn = f1 + f0;
				System.out.print(fn + " ");
				f0 = f1;
				f1 = fn;
			}
		}
		else 
			System.out.print(n - 1);
	}
	
	public int fibonacciRecursion(int n)
	{
		if (n <= 2)
			return n - 1;
		else 
			return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}
	
	public static void main(String[] args)
	{
		H5 h = new H5();
		h.fibonacciLoop(8);
		System.out.println();
		
		int n = 8;
		for (int i = 1; i <= n; i++)
			System.out.print(h.fibonacciRecursion(i) + " ");
	}
}
