package homeworks;

public class H1b
{
	public void vowel(char ch)
	{
		switch(ch)
		{
			case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
			default -> System.out.println("consonant");
		}
	}
	public static void main(String[] args)
	{
		H1b h = new H1b();
		char ch = 'a';
		h.vowel(ch);
		
		ch = 'b';
		h.vowel(ch);	
	}
}
