package inheritance;

public class Cat extends Animal
{
// constructor
	public Cat(String aType)
	{
		super(aType);
	}
	
// methods
	public void eat()
	{
		System.out.println("eating fish...");
	}
}
