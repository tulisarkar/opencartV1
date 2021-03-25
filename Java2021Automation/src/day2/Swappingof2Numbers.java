package day2;

public class Swappingof2Numbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping");
		System.out.println("****************");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("After swapping");
		System.out.println("***************");
		//a=a+b;
		//b=a-b;
		//a=a-b;
		//************
		//a=a*b;//200
		//b=a/b;//10
		//a=a/b;//20
		//*************
		//a=a+b-(b=a);//20
		//***************
		//^xoR
		a=a^b;//10^20=30
		b=a^b;//30^20=10
		a=a^b;//30^10=20
				
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	

//second way with temp variable

int x= 100;
int y = 200;
int temp;
System.out.println("Before swapping");
System.out.println("****************");
System.out.println("x= "+x);
System.out.println("y= "+y);
temp=x;
x=y;
y=temp;
System.out.println("After swapping");
System.out.println("****************");
System.out.println("x= "+x);
System.out.println("y= "+y);

}
}