package foundation;

public class TestStudent
{
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.eat();
		System.out.println(st1.getName());
		
		st1.setName("Vasya");
		System.out.println(st1.getName());
		
		Student st2 = new Student("Anya", "female");
		st2.eat();
		System.out.println(st2.getGender());
		System.out.println(st2.getName());
	}
}
