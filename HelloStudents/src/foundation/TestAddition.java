package foundation;

public class TestAddition
{
	public static void main(String[] args)
	{
		Addition a; // declaration
		a = new Addition(); // initialization
		
		System.out.println("Sum 2 + 2 = " + a.add(2, 2)); 
		
		System.out.println(a.add(1.1, 2.2));
	}
}
