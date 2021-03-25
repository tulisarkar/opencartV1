package day10;

public class Calculations implements X,Y
{
public void add()
{
	System.out.println(a+b);
}
public void mul()
{
	System.out.println(a*b);
}
	public static void main(String[] args) {
		
		Calculations c= new Calculations();
		c.add();
		c.mul();
		

	}

}
