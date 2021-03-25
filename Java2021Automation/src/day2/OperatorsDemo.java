package day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Sum of a and b is:  "+(a+b));
		System.out.println("Diff of b and a is" +(b-a));
		System.out.println("Multiplication of b and a is" +(a*b));
		System.out.println("Division of b and a is" +(b/a));
		System.out.println("Modulo division of b and a is" +(b%a));
		System.out.println(a>b);
		System.out.println(b>a);
		a=100;
		b=200;
		System.out.println(a>=b);//either a>b or a=b
		System.out.println(a<=b);
		a=10;
		b=20;
		System.out.println(a!=b);
		a=30;
		b=30;
		System.out.println(a==b);
		//logical operators &&  ||
		boolean x= true;
		boolean y= true;
		System.out.println(x && y);//true
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//false
		//increament and decreament operators ++, --
	}

}
