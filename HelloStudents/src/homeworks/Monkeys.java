package homeworks;

public class Monkeys
{
	private boolean aSmile;
	private boolean bSmile;
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
	{
		return (aSmile == true && bSmile == true || aSmile == false && bSmile == false);
	}
}
