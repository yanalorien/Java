package strings;

public class StringManipulation
{
	public static void main(String[] args)
	{
		String sentence = "I like learning Java 14";
		
		int sizeOfSentence = sentence.length();
		for (int i = 0; i < sizeOfSentence; i++)
			System.out.print(sentence.charAt(sizeOfSentence - 1 - i));
		
		System.out.println(); // new line
		for (int i = sizeOfSentence - 1; i >= 0; i--)
			System.out.print(sentence.charAt(i));
		
		String palindrome = "Dot saw I was Tod";
		StringBuilder sb = new StringBuilder(palindrome);
		sb.reverse();
		System.out.println("\n" + sb + "\n");
		
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++)
			System.out.println(words[i]);
	}
}
