package homeworks;

public class Vowels
{
	private char ch;
	
	public void vowels(char ch)
	{
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is a vowel");
		else
			System.out.println(ch + " is a consonant");
	}
}
