package day9;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class XYZ extends ABC
{
	void m1(int a)//overriding concept
	{
		System.out.println(a*a);
	}
	void m2(int a,int b)//overloading concept
	{
		System.out.println(a+b);
	}
}
public class OverridingOverloading {

	public static void main(String[] args) {
	XYZ obj= new XYZ();
	obj.m1(2);
	obj.m2(10);
	obj.m2(10,20);
	

	}

}
