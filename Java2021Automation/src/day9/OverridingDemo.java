package day9;


	
	class Bank
	{
		double rateOfInterest()
		{
			return 0;
		}
			}
	
class ICICI extends Bank
{
double rateOfInterest()
{
	return 10.5;
}
}
class Axis extends Bank
{
	double rateOfInterest()
	{
		return 12.5;
	}
	
}
public class OverridingDemo {
	public static void main(String[] args) {
		
Bank b= new Bank();
System.out.println(b.rateOfInterest());
ICICI iciciobj= new ICICI();
System.out.println(iciciobj.rateOfInterest());
Axis axisobj=new Axis();
System.out.println(axisobj.rateOfInterest());

	}

}
