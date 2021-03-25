package day8;

public class StaticExample {
static int a=10;//static variable
int b=20;// non static variable
static void m1()
{
	System.out.println("This is a static method");
}
	void m2()
	{
		System.out.println("This is non static method");
	}
	public void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	
}
