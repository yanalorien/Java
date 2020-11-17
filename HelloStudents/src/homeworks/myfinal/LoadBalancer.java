package homeworks.myfinal;

import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LoadBalancer
{
	private Map<Character, Integer> map;
	private Set<Character> keys;
	private int range = 0;
	
	public LoadBalancer(Map<Character, Integer> servers)
	{
		map = servers;
		keys = map.keySet();
		convertValueToRanges();
	}
	
	private void convertValueToRanges()
	{
		for(Character key: keys)
		{
			range = range + map.get(key);
			map.put(key, range);
		}
		System.out.println("Max range: " + range);
	}
	
	public char getServer()
	{
		Random rand = new Random();
		int random = rand.nextInt(range) + 1; // 0 - 5
		
		for (Character key: keys)
			if (random <= map.get(key))
				return key;
		return ' ';
	}
}
