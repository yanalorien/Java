package foundation;

public class Car
{
// class variables	
	private double startMiles;
	private double endMiles;
	private double gallons;
// constructor
/*
 * public Car(double sm, double em, double gallonsPerRide)
 * {
 * startMiles = sm;
 * endMiles = em;
 * gallons = gallonsPerRide;
 * }
 */

	public Car()
	{
		startMiles = 11.2;
		endMiles = 23.0;
		gallons = 2.1;
	}

	public void setStartMiles(double startMiles)
	{
		this.startMiles = startMiles;
	}

	public void setEndMiles(double endMiles)
	{
		this.endMiles = endMiles;
	}

	public void setGallons(double gallons)
	{
		this.gallons = gallons;
	}

	// class methods
	public double calculateMPG()
	{
		return (endMiles - startMiles) / gallons;
	}
}
