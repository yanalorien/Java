package statics;

public class TestStatics
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Alex", "Minsk");
		Student s2 = new Student("Inna", "Kiev");
		
		String school = Student.getSchool();
		int numberOfStudents = Student.getNumberOfStudents();
		
		System.out.println(school + " " + numberOfStudents);
	}
}
