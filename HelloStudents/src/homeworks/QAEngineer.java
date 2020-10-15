package homeworks;

public class QAEngineer extends Employee
{
	private double signinBonus;
	
	public QAEngineer(String name, double salary, String company, double bonus)
	{
		super(name, salary, company);
		signinBonus = bonus;
	}
	
	public double getSigninBonus()
	{
		return signinBonus;
	}
}
