package day9;

final class Temp//cannot extend into another class
{
	 final void m1()
	{
		System.out.println("This method is m1");
	}
}
class TempChild extends Temp
{
	void m1()//method override cannot be done as final keyword is used
	{
		System.out.println("This is methord override");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		
	}

}
