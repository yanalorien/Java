package homeworks;

public class H6
{
	public boolean isPalindrome(String str)
	{
		str = str.toLowerCase();
		String[] words = str.split(" ");
		String pal = "";
		for (int i = 0; i < words.length; i++)
			pal = pal + words[i];
		
		int length = pal.length();
		for (int i = 0; i < length/2; i++)
			if (pal.charAt(i) != pal.charAt((length - 1) - i))
				return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		String palindrome = "Madam";
		H6 h = new H6();
		System.out.println(h.isPalindrome(palindrome));
		
	}
}
