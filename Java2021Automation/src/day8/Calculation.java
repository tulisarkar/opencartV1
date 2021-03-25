package day8;

public class Calculation {
	int sum(int x,int y)
	{
		return (x+y);
	}
	int sum(int x,int y, int z)
	{
		return (x+y+z);
	}
	double sum(double x, double y)
	{
		return (x+y);
	}
	double sum(double x, double y, double z)
	{
		return (x+y+z);
	}
	

	public static void main(String[] args) {
		Calculation calc= new Calculation();
		System.out.println(calc.sum(10, 20));
		System.out.println(calc.sum(10,20,30));
		System.out.println(calc.sum(10.5, 20.5));
		System.out.println(calc.sum(10.5, 20.5, 30.5));
	}
}
