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
	}
}
