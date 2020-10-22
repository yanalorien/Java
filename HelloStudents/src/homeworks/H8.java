package homeworks;

public class H8
{
	public static void main(String[] args)
	{
		int[] numbers = {25, -1, 1, 1, 1, 22, 0};
		
		int min = Integer.MAX_VALUE;
		int second = min;
		
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] < min)
				min = numbers[i];
			else 
				if (numbers[i] < second)
					second = numbers[i];
		
		System.out.println("Second smallest number: " + second);
	}
}
