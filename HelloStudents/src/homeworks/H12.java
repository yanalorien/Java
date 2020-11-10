package homeworks;

import java.util.Random;

public class H12
{
	public int getRandomNumber(int min, int max)
	{
		return min + (int)(Math.random() * ((max - min) + 1)); // 0.0 to 0.99999
	}
	
	public int getRandomNumber2(int min, int max)
	{
		var r = new Random();
		return min + r.nextInt((max - min) + 1);
	}
	
	public static void main(String[] args)
	{
		int min = 25;
		int max = 68;
		
		H12 homework = new H12();
		System.out.println("Using Math.random");
		for (int i = 0; i < 10; i++)
			System.out.printf("%d ", homework.getRandomNumber(min, max));
		
		System.out.println("\nUsing newtInt from Random");
		for (int i = 0; i < 10; i++)
			System.out.printf("%d ", homework.getRandomNumber2(min, max));
	}
}
