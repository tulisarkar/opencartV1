package day10;

interface I
{
	int a=10;//variable is final and static
	void display();//abstract method
	default void square()//From java 8 default methods allowed
	{
		System.out.println(a*a);
	}
	
}

public class MyClass implements I
{
	public void display()//if public not specified it is treated as default
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		//MyClass mc= new MyClass();
		I mc= new MyClass();
		mc.display();
		mc.square();
		

	}

}
