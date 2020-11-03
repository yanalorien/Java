package datastructures;

import java.util.HashMap;
import java.util.Map;

public class MapInterface
{
	public static void main(String[] args)
	{
		Map<String, Integer> animals = new HashMap<String, Integer>();
		animals.put("dog", 1);
		animals.put("horse", 1);
		animals.put("rabbit", 68);
		
		int dogNumber = animals.get("dog");
		System.out.println(dogNumber);
		int size = animals.size();
		
		System.out.println("Number of the map entries: " + size);
		
		if (animals.containsKey("rabbit"))
			System.out.println("Zoo has rabbits");
		
		System.out.println(animals.containsValue(1));
		
		animals.forEach((k, v) -> System.out.println(k + " = " + v));
		
		Map<String, Integer> zoo = Map.of("dog", 1, // Object, Object
						"horse", 1,
						"rabbit", 68);
		
		int horseNumber = zoo.get("horse");
		System.out.println("horse number: " + horseNumber);
	}
}
