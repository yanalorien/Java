package homeworks;

public class TestMonkeys
{
	public static void main(String[] args)
	{
		Monkeys test = new Monkeys();
		boolean test1 = test.monkeyTrouble(true, false);
		System.out.println(test1);
		
		boolean test2 = test.monkeyTrouble(true, true);
		System.out.println(test2);
		
		boolean test3 = test.monkeyTrouble(false, true);
		System.out.println(test3);
		
		boolean test4 = test.monkeyTrouble(false, false);
		System.out.println(test4);
	}
}
