package controls;
public class IfElse
{
	public static void main(String[] args)
	{
		boolean condition = true;
		
		if (condition)
			System.out.println("Inside if");
		else
			System.out.println("Inside else");
		
		int age = 68;
		if (age >= 21)
			System.out.println("You can drink alcohol");
		else
			System.out.println("You are underage and not allowed to consume alcohol");
		
	}
}
// when age is 21 and over, you can drink alcohol
// test when age = 18 and age = 21 and age = 68;

