package homeworks;

public class H1c
{
	public static void main(String[] args)
	{
		int a = 68;
		int b = 25;
		
		a -= b; //a = a - b; //43
		b += a; //b = a + b; //68
		a = b - a; //25
		
		System.out.println("a = " + a + "; " + "b = " + b);
	}
}
