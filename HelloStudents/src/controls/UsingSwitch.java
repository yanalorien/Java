package controls;

public class UsingSwitch
{
	public static void main(String[] args)
	{
// 1
		System.out.println("1. Traditional");
		int index = 3;
		
		switch(index)
		{
			case 1:
				System.out.println("1 case");
				break;
			case 2:
				System.out.println("2 case");
			    break;
			case 3:
				System.out.println("3 case");
				break;
			default:
				System.out.println("default");
		}
		        
// 2
		System.out.println("2. Enhanced");
		index = 2;
		
		switch(index)
		{
			case 1 -> System.out.println("1 case");
			case 2 -> System.out.println("2 case");
			case 3 -> System.out.println("3 case");
			default -> System.out.println("default");
		}
		
// 3
		System.out.println("3. Assignment");
		index = 4;
		
		String caseNumberStr = 
				switch(index) 
				{
					case 1 -> "1 case";
					case 2 -> "2 case";
					case 4 -> "4 case";
					default -> "default case";
				};
		System.out.println(caseNumberStr);
		
// 4
		System.out.println("4. Multiple cases");
		index = 8;
		
		caseNumberStr = 
				switch(index)
				{
					case 0 -> "0 case";
					case 1, 3, 5, 7, 9 -> "odd case";
					case 2, 4, 6, 8, 10 -> "even case";
					default -> "greater than 10";
				};
		System.out.println(caseNumberStr);
		
// 5
		System.out.println("5. Multiple case statements");
		index = 11;
		
		switch(index)
		{
			case 1 -> System.out.println("1 case");
			case 11 -> { System.out.println("\tFirst line in case 11");
						 System.out.println("\tSecond line in case 11");}
			default -> System.out.println("default");
		}
	}
}
