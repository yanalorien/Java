package inheritance;

public class Animal //superclass
{
	private String type;
	
// constractor
	public Animal(String aType)
	{
		type = aType;
	}

// methods
	public void eat()
	{
		System.out.println("eating...");
	}
	
// getter
	public String getType()
	
	{
		return type;
	}
}
