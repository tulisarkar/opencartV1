package day10;

public class B implements A
{
	public void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		B obj=new B();
		obj.sum();

	}

}
