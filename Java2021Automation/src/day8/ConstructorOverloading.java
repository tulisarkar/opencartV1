package day8;

public class ConstructorOverloading {
	
	ConstructorOverloading()//default constructor
	{
		System.out.println("This is default constructor");
	}
	ConstructorOverloading(int a, int b)//parameterized constructor
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(int a, int b,int c)//parameterized constructor
	{
		System.out.println(a+b+c);
	}
	ConstructorOverloading(double a, double b,double c)//parameterized constructor
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		//ConstructorOverloading co=new ConstructorOverloading();
		//ConstructorOverloading co=new ConstructorOverloading(10,20);
		//ConstructorOverloading co=new ConstructorOverloading(10,20,30);
		ConstructorOverloading co=new ConstructorOverloading(10.5,20.5,30.5);
		

	}

}
