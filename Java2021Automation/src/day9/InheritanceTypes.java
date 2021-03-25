package day9;

class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}
class c extends B
{
	int c=300;
	void print()
	{
		System.out.println(c);
	}
}




public class InheritanceTypes {

	public static void main(String[] args) {
		
		//A obja= new A();
		//obja.display();//comes from A
		//B objb=new B();
		//objb.display();
		//objb.show();
		c objc= new c();
		
		objc.a=10;
		objc.b=20;
		objc.c=40;
		objc.display();
		objc.show();
		objc.print();
		
		

	}

}
