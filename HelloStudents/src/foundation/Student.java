package foundation;

public class Student
{
	private String name;
	private String gender;

// class methods
	public void eat()
	{
		System.out.println("I am eating eel");
	}
	
// default constructor
	public Student()
	{
		name = "Adam";
		gender = "male";
	}
	
// non-default constructor
	public Student(String n, String g)
	{
		name = n;
		gender = g;
	}
	
// getters & setters 
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
}
