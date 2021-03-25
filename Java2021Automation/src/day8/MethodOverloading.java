package day8;

public class MethodOverloading {
int x,y,z;
double d;
void sum()
{
	x=1;
	y=2;
	System.out.println(x+y);
}
void sum(int a,int b)
{
	x=a;
	y=b;
	System.out.println(x+y);
}

void sum(int a,double b)
{
	x=a;
	d=b;
	System.out.println(x+y);
}
void sum(int a,int b,int c)
{
	x=a;
	y=b;
	z=c;
	System.out.println(x+y+z);
}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.sum(10, 20);
		mo.sum(10, 10.5);
		mo.sum(10, 30, 40);
		mo.sum();
		

	}

}
