package foundation;

public class TestCar
{
	public static void main(String[] args)
	{
/*
 * Car car = new Car(1.1, 25.2, 7.0);
 * double mpg = car.calculateMPG();
 * System.out.println(mpg);
 */
		int a; // declaration
		a = 8; // initialization
		a = 11; 
		
		Car car2 = new Car();
		double mpg = car2.calculateMPG();
		System.out.println(mpg);
		
		Car car3 = new Car();
		car3.setEndMiles(25.2);
		car3.setStartMiles(1.1);
		car3.setGallons(7.0);
		
		mpg = car3.calculateMPG();
		System.out.println(mpg);
	}
}
