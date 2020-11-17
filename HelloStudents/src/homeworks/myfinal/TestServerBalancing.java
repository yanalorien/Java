package homeworks.myfinal;

import java.util.HashMap;

public class TestServerBalancing
{
	public static void main(String[] args)
	{
		var servers = new HashMap<Character, Integer>();
		servers.put('X', 3);
		servers.put('Y', 1);
		servers.put('Z', 2);
		
		var balancer = new LoadBalancer(servers);
		for (int i = 0; i < 20; i++)
			System.out.printf("%c ", balancer.getServer());
	}
}
