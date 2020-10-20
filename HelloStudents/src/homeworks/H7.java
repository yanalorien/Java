package homeworks;

import java.util.Arrays;

public class H7
{
	public boolean isAnagram(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		
		 char[] letters1 = s1.toLowerCase().toCharArray();
		 char[] letters2 = s2.toLowerCase().toCharArray();
		 
		 Arrays.sort(letters1);
		 Arrays.sort(letters2);
		 
		 System.out.println("s1: " + new String(letters1));
		 System.out.println("s2: " + new String(letters2));
		 
		 return Arrays.equals(letters1, letters2);
	}
	
	public static void main(String[] args)
	{
		String s1 = "Debit card";
		String s2 = "Bad credit";
		
		H7 h = new H7();
		if (h.isAnagram(s1,  s2))
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");
	}
}
