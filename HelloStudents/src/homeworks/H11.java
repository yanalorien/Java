package homeworks;

import java.util.HashMap;
import java.util.HashSet;

public class H11
{
	public static void main(String[] args)
	{
		String[] words = {"One", "Two", "One", "Eleven", "Eight", "Eight"};

// 1a
		var set = new HashSet<String>();
		for (String word: words)
			set.add(word);
		
		if (set.size() == words.length)
			System.out.println("There are no duplicates");
		else
			System.out.println("There are duplicates in the array");
		
// 1b
		for (String word: words)
			if (!set.add(word))
			{
				System.out.println("There are duplicates in the array");
				break;
			}
			else
				System.out.println("There are no duplicates in the array");
		
// 2
		for (String word: set)
			System.out.println(word);
		
// 3
		var map = new HashMap<String, Integer>();
		for (String word: words)
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		map.forEach((k, v) -> System.out.println(k + " = " + v));
	}
}
